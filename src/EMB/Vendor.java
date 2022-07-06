package EMB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vendor {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		driver.get("https://preprod.erp1.upda.co.in/#/login.com/");
		Thread.sleep(3000);
	}
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("7778889999");
		driver.findElement(By.id("password")).sendKeys("User@1");
		driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Actions actions = new Actions(driver);
	 WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("b_acct_id"))).click();
		
	        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='14 - Lucknow Development Authority']"));
	        actions.moveToElement(element).click().build().perform();
	        driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	       
	        //System.out.println("come here 1");
	        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	
	@Test (priority=1,enabled=false)
	public void org() throws InterruptedException
	{
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("sky@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518520");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Prabal");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("sky1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518520");

   driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("Prabal");
   driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1995");
   driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("123456");
   driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();

	}
	@Test  (priority=2,enabled = false)
	public void individual() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Individual']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Prabal");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("sky1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518521");

       driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("Prabal");
       driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1998");
       driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("123456");
       driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();


	}
	@Test(priority=3)
	public void create() throws InterruptedException
	{driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7539518520");
	driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7539518521");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("121");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("32AADCB2230M1Z2");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AADCB2230M");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("987447895632");
    
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of India");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("548545254");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("Indira Nagar");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BKID0006800");
    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click();

	driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	
	Thread.sleep(3000);
	}
	@AfterMethod
	public void stop()
	{
		driver.close();
	}

}
