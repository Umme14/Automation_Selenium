import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Establish2 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setAcceptInsecureCerts(true);
	
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.get("https://dev.erp2.upda.co.in/#/login.com/");
	Thread.sleep(3000);
	

	driver.findElement(By.name("email")).sendKeys("9807909114");
	driver.findElement(By.id("password")).sendKeys("User@1");
	driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

	Thread.sleep(3000);
	
	
	
	 Actions actions = new Actions(driver);
	 WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("b_acct_id"))).click();
		
	        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='9 - Dev Account Module']"));
	        actions.moveToElement(element).click().build().perform();
	        driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	        Thread.sleep(3000);
	        System.out.println("come here 1");
	        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	        driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();

	}
	@SuppressWarnings("deprecation")
	@Test
	public void move() {
	      
	       
		
			WebDriverWait wait1=new WebDriverWait(driver, 20); 
	        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='javascript:;']//i[@class='sidebar-item-icon fa fa-users']"))).click();;
	        driver.findElement(By.xpath("//a[@routerlink='/hrms/party/list']")).click();
	        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='active']"))).click();
	        driver.findElement(By.xpath("//a[@routerlink='/hrms/party/edu-info']")).click();
	      driver.findElement(By.xpath("//button[@class='btn btn-outline-primary']")).click();

}
	@AfterTest
	public void stop()
	{
		driver.close();
		driver.quit();
	}
}
