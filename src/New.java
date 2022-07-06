
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
import org.testng.asserts.SoftAssert;

public class New {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod

	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://192.168.29.243:4200/#/login");
		
		Thread.sleep(3000);
	
	
	
		driver.findElement(By.xpath("//input[2]")).click();
		driver.findElement(By.name("email")).sendKeys("admin@vda.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@class='col-5']//button[@type='submit'][normalize-space()='Login']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/hrms.png']")).click();
	
	 WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='sidebar-item-icon fa fa-users']"))).click();
		driver.findElement(By.linkText("Joining")).click();
	}
	
	@Test(priority=1, enabled = false)
	public void valid() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("2wse");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys("Anamika");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("9874562431");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("M K Chaubey");
       
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
			Thread.sleep(3000);

			driver.findElement(By.name("field_name")).click();
			 @SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,30);
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CENTRALISED']"))).click();
				
			//driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']")).click();
		WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
		dob.clear();
		dob.sendKeys("01/04/1995");
		WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
		doj.clear();
		doj.sendKeys("01/04/2010");
		WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
		dos.clear();
		dos.sendKeys("01/04/2010");
		driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
		driver.findElement(By.cssSelector("div[class='ng-select-container'] input[role='combobox']")).click();
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='AFTERNOON']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	}
	@Test(priority=2, enabled = false)
	public void emptyId() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys(" ");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("9874562431");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("M K Chaubey");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
		Thread.sleep(3000);

		//driver.findElement(By.className("ng-input")).click();
		WebElement element = driver.findElement(By.className("ng-input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	
			
	WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(element2).click().build().perform();

	WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
	dob.clear();
	dob.sendKeys("01/04/1995");
	WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
	doj.clear();
	doj.sendKeys("01/04/2010");
	WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
	dos.clear();
	dos.sendKeys("01/04/2010");
	driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='MORNING']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	@Test(priority = 3, enabled = false)
	public void empName() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("vda11");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys(" ");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("9874562431");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("M K Chaubey");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
		Thread.sleep(3000);

		//driver.findElement(By.className("ng-input")).click();
		WebElement element = driver.findElement(By.className("ng-input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	
			
	WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(element2).click().build().perform();

	WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
	dob.clear();
	dob.sendKeys("01/04/1995");
	WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
	doj.clear();
	doj.sendKeys("01/04/2010");
	WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
	dos.clear();
	dos.sendKeys("01/04/2010");
	driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='MORNING']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	@Test(priority = 4, enabled = false)
	public void empPhone() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("vda11");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys("Khushnuma");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("M K Chaubey");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
		Thread.sleep(3000);

		//driver.findElement(By.className("ng-input")).click();
		WebElement element = driver.findElement(By.className("ng-input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	
			
	WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(element2).click().build().perform();

	WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
	dob.clear();
	dob.sendKeys("01/04/1995");
	WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
	doj.clear();
	doj.sendKeys("01/04/2010");
	WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
	dos.clear();
	dos.sendKeys("01/04/2010");
	driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='MORNING']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	@Test(priority = 5, enabled = false)
	public void invalidPhone() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("vda11");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys("Khusnuma");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("98745");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("M K Chaubey");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
		Thread.sleep(3000);

		//driver.findElement(By.className("ng-input")).click();
		WebElement element = driver.findElement(By.className("ng-input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	
			
	WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(element2).click().build().perform();

	WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
	dob.clear();
	dob.sendKeys("01/04/1995");
	WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
	doj.clear();
	doj.sendKeys("01/04/2010");
	WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
	dos.clear();
	dos.sendKeys("01/04/2010");
	driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='MORNING']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	@Test(priority = 6)
	public void emptyFather() throws InterruptedException
	{
		WebElement id = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
		id.clear();
		id.sendKeys("vda11");
		WebElement name =driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]"));
		name.clear();
		name.sendKeys("Khusnuma");
		WebElement phone =driver.findElement(By.xpath("//div[3]//div[2]//input[1]"));
		phone.clear();
		phone.sendKeys("9874578774");
		WebElement gmail =driver.findElement(By.xpath("//input[@type='email']"));
		gmail.clear();
		gmail.sendKeys("abc@gmail.com");
		WebElement fname =driver.findElement(By.xpath("//div[5]//div[2]//input[1]"));
		fname.clear();
		fname.sendKeys("");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 
		Thread.sleep(3000);

		//driver.findElement(By.className("ng-input")).click();
		WebElement element = driver.findElement(By.className("ng-input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	
			
	WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(element2).click().build().perform();

	WebElement dob =driver.findElement(By.xpath("//div[6]//div[2]//input[1]"));
	dob.clear();
	dob.sendKeys("01/04/1995");
	WebElement doj =driver.findElement(By.xpath("//div[8]//div[2]//input[1]"));
	doj.clear();
	doj.sendKeys("01/04/2010");
	WebElement dos =driver.findElement(By.xpath("//div[9]//div[2]//input[1]"));
	dos.clear();
	dos.sendKeys("01/04/2010");
	driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("123");
	driver.findElement(By.xpath("//div[@class='ng-select-container']//input[@role='combobox']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='MORNING']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	/*String a = driver.findElement(By.xpath("//div[5]//div[2]//input[1]")).getText();
	String b = "* fields required.";
	Assert.assertEquals(a, b);*/
	
	}
		
	
	@AfterMethod
	public void close()
	{
	
		driver.close();
	}
		
				



}