package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_selenium {

	@Test
	public void salesforce() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.get("https://login.salesforce.com/");

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		WebElement toggle = driver.findElement(By.xpath("//div[@data-aura-rendered-by='444:83;a']"));
		jsExecutor.executeScript("arguments[0].click();", toggle);


		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();


		WebElement elementLocator = driver.findElement(By.xpath("//span[text()='Accounts']"));
		jsExecutor.executeScript("arguments[0].click();", elementLocator);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Mari Vignesh");
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		driver.close();  //or driver.quit();
	}

}