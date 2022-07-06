import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Establish1 {
	@SuppressWarnings("deprecation")
	@Test

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
		driver.get("https://dev.erp2.upda.co.in/#/login.com/");
		Thread.sleep(3000);
		
	
		driver.findElement(By.name("email")).sendKeys("9807909114");
		driver.findElement(By.id("password")).sendKeys("User@1");
		driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				

		Thread.sleep(3000);
		System.out.println("Come here 0");
		
		
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
		      
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='javascript:;']//i[@class='sidebar-item-icon fa fa-users']"))).click();;
		        driver.findElement(By.xpath("//a[@routerlink='/hrms/party/list']")).click();
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='active']"))).click();
		        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();	  
		        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9854811544");
		        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		        driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//div[3]//div[2]//input[1]")).sendKeys("Anamika");
		        driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//input[@type='email']")).sendKeys("anamika@gmail.com");
		        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("06/04/1998");
		        driver.findElement(By.xpath("//div[@id='cdk-step-content-0-1']//button[@type='submit'][normalize-space()='Next']")).click();
		        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-emplist[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[2]/div[2]/input[1]")).sendKeys("11");
		        driver.findElement(By.name("field_name")).click();
		        driver.findElement(By.xpath("//span[normalize-space()='ADMINISTRATION']")).click();
		        driver.findElement(By.xpath("//span[normalize-space()='Establishment & Payroll']")).click();
		        driver.findElement(By.xpath("//span[normalize-space()='Engineering']")).click();
		        driver.findElement(By.className("ng-arrow-wrapper")).click();
		        driver.findElement(By.xpath("//button[normalize-space()='Select Employee Node']")).click();
		        driver.findElement(By.xpath("//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")).click();
		        driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		        driver.findElement(By.xpath("//div[@class='col-2 ng-star-inserted']//button[@class='btn btn-primary']")).click();
		        driver.findElement(By.xpath("//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")).click();
		        driver.findElement(By.xpath("//span[normalize-space()='HR - Head Quarter - ROOTORG']")).click();
		        driver.findElement(By.xpath("//div[@class='col-2 ng-star-inserted']//button[@class='btn btn-primary']")).click();
		        driver.findElement(By.xpath("//div[@class='ng-select-container']//span[@class='ng-arrow-wrapper']")).click();

		        driver.findElement(By.xpath("//span[contains(@class,'ng-option-label ng-star-inserted')][normalize-space()='Accounts - Accounts Section - Section']")).click();

                driver.findElement(By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
               // driver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-success')][normalize-space()='Submit']")).click();
		        
                WebDriverWait wait1=new WebDriverWait(driver, 20); 
                wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cdk-step-content-0-2']//button[@type='submit'][normalize-space()='Next']"))).click();
                driver.findElement(By.xpath("//button[@class='btn btn-outline-success'][normalize-space()='Submit']")).click();
                System.out.println("here");
                driver.findElement(By.xpath("//button[normalize-space()='Yes, Add it!']")).click();
		        Thread.sleep(3000);
		    
		
		
		driver.close();
				
				

	}

}
