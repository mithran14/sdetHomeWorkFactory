package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_selenium {

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
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		//Password :Leaf$1234
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(list.get(0));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();  //or driver.quit();
	}

}
