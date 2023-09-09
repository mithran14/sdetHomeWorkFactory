package dailyConnectAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class JiraToday {

	String Summary="Mari Vignesh New Story for Automation";

	@Test
	public void jiraProject() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		//url
		driver.get("https://api-training.atlassian.net/");

		//Enter username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com",Keys.ENTER);
		//Enter password
		driver.findElement(By.id("password")).sendKeys("India@123");
		//click login
		driver.findElement(By.xpath("//span[text()='Log in']")).click();

		//Select SDET-5 project
		WebElement project = driver.findElement(By.xpath("//p[text()='SDET-5']"));
		wait.until(ExpectedConditions.elementToBeClickable(project));

		//Click on Create button
		driver.findElement(By.xpath("//span[text()='Create']")).click();

		//Enter Summary which is mandatory
		driver.findElement(By.name("summary")).sendKeys(Summary);

		//Click on Create button
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();

		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();

		//Click on Backlog on the left panel
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();

		//Search for the story we created in the search field and verify the newly created story
		driver.findElement(By.name("search")).sendKeys(Summary);

		//verify
		String text = driver.findElement(By.xpath("//mark[text()='"+Summary+"']")).getText();

		Assert.assertEquals(Summary, text);

		
		driver.quit();
	}

}