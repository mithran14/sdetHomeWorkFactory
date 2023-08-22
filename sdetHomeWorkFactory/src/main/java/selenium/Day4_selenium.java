package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_selenium {

	@Test
	public void salesforce() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
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
		//Click View All and Type Content on the Search box
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content");
		//Click the Content Link
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		// Click on Chatter Tab
		WebElement Chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		jsExecutor.executeScript("arguments[0].click();", Chatter);
		// Verify the Chatter title on the page
		String title = driver.getTitle();
		
		if (title.contains("Home")) {
			System.out.println("Verified");
		}
		// Click the Question tab
		driver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
		// Type Question 
		String ques="What is your fav movie?";
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(ques);
		// Type Details 
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(ques);
		// Click Ask
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		// Confirm the question appears
		String whatIsYour = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		if (whatIsYour.equals(ques)) {
			System.out.println("equal");
		}
		// Close the browser
		driver.close();  //or driver.quit();
	}

}
