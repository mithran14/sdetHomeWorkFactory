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




public class Day2_selenium {

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
		WebElement toggle = driver.findElement(By.xpath("//div[@data-aura-rendered-by='444:83;a']"));
		jsExecutor.executeScript("arguments[0].click();", toggle);


		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'section-control slds-button')]//lightning-primitive-icon")).click();
		//Click View All and click Dashboards from App Launcher
		WebElement targetElement = driver.findElement(By.xpath("//p[text()='Dashboards']"));
        // Scroll to the target element using JavaScript
		jsExecutor.executeScript("arguments[0].scrollIntoView();", targetElement);
		 wait.until(ExpectedConditions.visibilityOf(targetElement));
        // Click on the target element
        targetElement.click();

		//Click on the New Dashboard option
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		//Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
		WebElement dashboardName = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		dashboardName.sendKeys("Salesforce Automation by Mari Vignesh");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.close();  //or driver.quit();
	}

}
