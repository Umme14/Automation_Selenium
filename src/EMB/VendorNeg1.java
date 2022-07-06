package EMB;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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
import org.testng.annotations.Test;

public class VendorNeg1 {
	WebDriver driver;
	

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void login() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setAcceptInsecureCerts(true);
	
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://preprod.erp1.upda.co.in/#/login.com/");
	Thread.sleep(3000);
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
	@Test(priority=2)
	public void emptyPartyType() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("sky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518520");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Please Select Legal Entity Type";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=1)
	public void emptyName() throws InterruptedException
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
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("esky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518525");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Please enter party name";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals("Validation of name is not present", actual,expected);
	
	}
	@Test
	public void existedEmail() throws InterruptedException
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
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("esky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518524");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Either Mobile Or Email Is Already Exists.";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals("Validation of email is not present", actual,expected);
	
	}
	@Test
	public void emptyEmail() throws InterruptedException
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
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7539518524");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Please Enter Email";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals("Validation of email is not present", actual,expected);
	
	}
	@Test
	public void emptyPhone() throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("seky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Please Enter Mobile Number";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals("Validation of number is not present", actual,expected);
	
	}
	@Test
	public void invalidPhone() throws InterruptedException
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
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("Sky Company");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("seky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("45454");
		driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String actual = "Invalid Mobile Number";
		String expected = driver.findElement(By.id("swal2-content")).getText();
		Assert.assertEquals("Validation of number is not present", actual,expected);
	
}

	@AfterMethod
	
	public void close() {
		driver.close();
		
	}
	
}
