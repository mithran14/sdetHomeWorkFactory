package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3_selenium {

	@Test
	public void salesforce() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		//Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		//Username :hari.radhakrishnan@qeagle.com
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//Password :Leaf$1234
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//Click on the toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();


		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Click View All and click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		// Click on the target element
		WebElement targetElement = driver.findElement(By.xpath("//span[text()='Campaigns']"));
		wait.until(ExpectedConditions.visibilityOf(targetElement));
		jsExecutor.executeScript("arguments[0].click();", targetElement);

		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[@role='status']")).getText();
		
		String[] split = text.split(" ");
		int parseInt = Integer.parseInt(split[0]);
		Thread.sleep(2000);

		if (parseInt!=0) {
			driver.findElement(By.xpath("//table[@role='grid']//tr[1]//td[10]")).click();
			driver.findElement(By.xpath("//a[@title='Delete']")).click();
			driver.findElement(By.xpath("//button[@title='Delete']")).click();
			Thread.sleep(2000);
		}

		//Click on the New  option
		driver.findElement(By.xpath("//div[@title='New']")).click();
		String gName="Mari Vignesh";
		driver.findElement(By.xpath("//input[@class=' input']")).sendKeys(gName);

		//Choose Start date as Tomorrow
		driver.findElement(By.xpath("//div[@class='form-element']//a")).click();
		driver.findElement(By.xpath("//table[@class='calGrid']/tbody[1]/tr/td[@tabindex='0']/following::span[1]")).click();
		// End date as Tomorrow+1
		driver.findElement(By.xpath("(//a[@class='datePicker-openIcon display'])[2]")).click();
		driver.findElement(By.xpath("//table[@class='calGrid']/tbody[1]/tr/td[@tabindex='0']/following::span[2]")).click();

		//Click on Save.
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();

		//Verify the newly created Campaign
		String name =driver.findElement(By.className("custom-truncate")).getText();

		if (gName.equals(name)) 
		{
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
		wait.until(ExpectedConditions.visibilityOf(targetElement));
		jsExecutor.executeScript("arguments[0].click();", targetElement);
		driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small')]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		driver.close();  //or driver.quit();
	}

}
