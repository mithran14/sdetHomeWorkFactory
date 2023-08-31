package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_selenium {

	WebDriver driver ;
	WebDriverWait wait;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	@Test
	public void windowTest() {
		driver.get("https://www.leafground.com/window.xhtml");
		//String oldWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		wait.until(ExpectedConditions.numberOfWindowsToBe(windowHandles.size()));
		List<String> list=new ArrayList<String>(windowHandles);
	
			String title = driver.switchTo().window(list.get(2)).getTitle();
			System.out.println(title);
			if (title.contains("Web Table")) {
				System.out.println("Verified");
			}
			else {
				System.out.println("Not Verified");
			}
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

