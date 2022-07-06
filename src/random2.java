
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class random2 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	@SuppressWarnings("deprecation")
	@Test

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver();
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
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employee"))).click();
		driver.findElement(By.linkText("Joining")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(3) > app-party:nth-child(2) > app-joining:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("va12");
		driver.findElement(By.xpath("//body/div[@class='page-wrapper ng-star-inserted']/div[@class='content-wrapper']/app-party[@class='ng-star-inserted']/app-joining[@class='ng-star-inserted']/div[@class='page-content fade-in-up']/div[@class='row']/div[@class='col-lg-12 col-md-12']/div[@class='ibox']/div[@class='ibox-body']/div[@class='tab-content']/div[@id='tab-1']/div[2]/div[2]/input[1]")).sendKeys("Anamika");
		driver.findElement(By.xpath("//div[3]//div[2]//input[1]")).sendKeys("9874562431");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//div[5]//div[2]//input[1]")).sendKeys("M K Chaubey");
       
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/input[1]")).sendKeys("03/03/1993");
		 //Actions acn=new Actions(driver);
	       // acn.moveToElement(giftcard).sendKeys("03/03/1993").build().perform(); 

		driver.findElement(By.name("field_name")).click();
		driver.findElement(By.xpath("//span[normalize-space()='CENTRALISED']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[8]/div[2]/input[1]")).sendKeys("01/04/2010");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[9]/div[2]/input[1]")).sendKeys("01/04/2010");
		driver.findElement(By.xpath("//div[10]//div[2]//input[1]")).sendKeys("12345");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-party[1]/app-joining[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[11]/div[2]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.cssSelector(".ng-option-label.ng-star-inserted[ng-reflect-ng-item-label='AFTERNOON']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes, Add it!']")).click();
		//WebElement date = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']"));
		//date.sendKeys("03/13/2017");
			//driver.findElement(By.cssSelector(".form-control.ng-valid.ng-touched.ng-dirty")).click();
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("Employee")).click();
		/* WebDriverWait wait1 = new WebDriverWait(driver,30);
			
			wait1.until(ExpectedConditions.elementToBeClickable(By.className("nav-link"))).click();
		driver.findElement(By.xpath("//a[normalize-space()='CREATE REPORT']")).click();*/

	Thread.sleep(3000);
	
	
		driver.close();
				
				

	}

}
