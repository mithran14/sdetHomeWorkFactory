package dailyConnectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead 
{
	WebDriver driver;
	@BeforeMethod
	public void common() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	@Test
	public void signin() throws InterruptedException 
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mari Vignesh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.name("description")).sendKeys("description");
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("marivignesh@gmail.com");
		
		WebElement generalSta = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")); 
		Select opt=new Select(generalSta);
		opt.selectByVisibleText("New York"); 
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		
		if (title.contains("View Lead")) {
			System.out.println("Title Verified");}
		else {
			System.out.println("Title Not Verified");
			}
		}
	@AfterMethod
	public void flush() 
	{
		driver.quit();
	}
}



