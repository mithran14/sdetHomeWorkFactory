package dailyConnectAssignment;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sdet_16_08_2023_Selenium {
	/*
	 * Access the top menu => Results
			//div[@class='primary-links']//following::span[contains(text(),'Results')]
			//span[contains(text(),'Results')]
			css=span:contains("Results")

	 * Driver Standings
			//a[contains(text(),'Driver Standings ')]
	 * 
	 * * Verify if the position is less than 10. If yes, then print "<The Driver name> is within 10 positions"
	 * Else print "<Driver Name> is out of 10 position by <difference between the driver position minus 10>"

	 */
	@Test
	public void xpath_Assign() throws IOException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.formula1.com");
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='SP Consent Message']"));
		driver.switchTo().frame(frame);
		WebElement accept = driver.findElement(By.xpath("//button[@title='ACCEPT ALL']"));
		accept.click();
		WebElement results = driver.findElement(By.xpath("//span[normalize-space()='Results']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(results).build().perform();
		WebElement standings = driver.findElement(By.xpath("//a[contains(@href,'driver-standings')]"));
		standings.click();
		Thread.sleep(3000);

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='SP Consent Message']"));
		if(frame1.isDisplayed()) {
			driver.switchTo().frame(frame1);
			WebElement accept1 = driver.findElement(By.xpath("//button[@title='ACCEPT ALL']"));
			accept1.click();
		}
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='resultsarchive-table']//tr"));
		int size = table.size();
		for (int i = 1; i < size; i++) {
			String getName=driver.findElement(By.xpath("//table[@class='resultsarchive-table']//tr[" + i + "]//td[3]")).getText();
			if (getName.equals("Lance Stroll")) //Lance Stroll //Oscar Piastri
			{
				WebElement getPosition=driver.findElement(By.xpath("//table[@class='resultsarchive-table']//tr[" + i + "]//td[2]"));
				int text = Integer.parseInt(getPosition.getText());
				System.out.println("Current Position is : "+text);
				if (text<=10) {
					System.out.println(getName+" is within 10 positions");
				}
				else {
					System.out.println(getName+" is out of 10 position by "+(i-10));
				}
			}
		}
		driver.close();
	}
}
