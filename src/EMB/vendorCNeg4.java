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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vendorCNeg4 {
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
	@Test(priority=1,enabled=false)
	public void existedPhone() throws InterruptedException
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
	//driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7539518521");
    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
    String actual="The Legal Entity does not exist. You will need to first create a new legal entity with these details before you can setup the legal entity as Vendor.";
    String expected =driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	Assert.assertEquals(expected, actual,"Validation not present");

}
	@Test(priority=2,enabled=false)
	public void moveTOPage() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7539518521");
	    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    String actual="Manage Vendors";
	    String expected =driver.findElement(By.xpath("//div[@class='ibox-title']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");


	}
	@Test(priority=3,enabled=false)
	public void emptyIndividual() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    //driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    String actual="The Legal Entity does not exist. You will need to first create a new legal entity with these details before you can setup the legal entity as Vendor.";
	    String expected =driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=4,enabled=true)
	public void emptyID() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=5,enabled=true)
	public void existedID() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("303");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=6,enabled=false)
	public void emptyGST() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("19");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid GISTIN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=7,enabled=false)
	public void invalidGST() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("12");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid GISTIN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=8,enabled=false)
	public void existedGST() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("09AJUPS2948G2ZE");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid GISTIN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=9,enabled=false)
	public void existedPAN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("FSVPS1634E");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid PAN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=10,enabled=false)
	public void emptyPAN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid PAN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=11,enabled=false)
	public void invalidPAN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCUa55447");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445563");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid PAN";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=12,enabled=false)
	public void existedAadhar() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("849297475319");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid Adhar";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=13,enabled=false)
	public void emptyAadhar() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid Adhar";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=14,enabled=false)
	public void invalidAadhar() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid Adhar";
	    String expected=driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=15,enabled=true)
	public void invalidBankName() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445132");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Dubai");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=16,enabled=false)
	public void invalidIFSC() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0555");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid IFSC";
	   String expected = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=17,enabled=false)
	public void emptyIFSC() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual="Invalid IFSC";
		   String expected = driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
			Assert.assertEquals(expected, actual,"Validation not present");
	}
	@Test(priority=18,enabled=true)
	public void emptyBankName() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    //String actual="Some Fields Are Incorrect";
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=19,enabled=true)
	public void emptyAccountN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=20,enabled=true)
	public void invalidAccountN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584bvhh");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    String actual = "Some Fields Are Incorrect";
	    String expected = driver.findElement(By.xpath("//span[@class='to-message toastr-message ng-star-inserted']")).getText();
		Assert.assertEquals(expected, actual,"Validation not present");

	}
	@Test(priority=21,enabled=true)
	public void existedAccountN() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("15454544252");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunpur");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=22,enabled=true)
	public void invalidBranch() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("jaunp");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	    if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
		  {
			  System.out.println("Validation  present");
		  }
		  else
		  {
			  System.out.println("Validation not present");
		  }
	}
	@Test(priority=23,enabled=true)
	public void emptyBranch() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
		
		driver.findElement(By.linkText("Vendors/Contractors")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number/Email']")).sendKeys("7474747410");
		driver.findElement(By.xpath("//div[@id='cdk-step-content-0-0']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[contains(@class,'row ng-star-inserted')]//div[3]//input[1]")).sendKeys("7474747411");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@class='btn btn-primary'][normalize-space()='Search']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER VENDOR ID')]")).sendKeys("1111");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER GSTIN']")).sendKeys("10AABCU9603R1Z2");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER PAN']")).sendKeys("AABCU9603R");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[@placeholder='ENTER AADHAR NO.']")).sendKeys("115451445123");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//div[7]//div[2]//input[1]")).sendKeys("Bank of Baroda");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER ACCOUNT NO.')]")).sendKeys("54545584");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER BANK BRANCH')]")).sendKeys("");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//input[contains(@placeholder,'ENTER IFSC')]")).sendKeys("BARB0JAUNPU");
	    driver.findElement(By.xpath("//div[@id='cdk-step-content-0-2']//button[contains(@class,'btn btn-primary')][normalize-space()='Next']")).click(); 
	  if(driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//button[@class='btn btn-primary'][normalize-space()='Submit']")).isDisplayed())
	  {
		  System.out.println("Validation  present");
	  }
	  else
	  {
		  System.out.println("Validation not present");
	  }
	 	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
	
	
	
	
	

