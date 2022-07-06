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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vendorUNeg5 {
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
	@Test(priority=1)
	public void update() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[8]/button[1]")).click();
	driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();
WebElement id=	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[2]/div[2]/div[2]/input[1]"));
id.clear();
id.sendKeys("222");
	/*driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/div[3]/ng-select[1]/div[1]/span[1]")).click();
driver.findElement(By.xpath("//span[normalize-space()='Individual']")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/mat-horizontal-stepper[1]/div[2]/div[1]/div[2]/div[2]/input[1]")).sendKeys("gomdhari@gmail.com");
driver.findElement(By.xpath("//button[@type='submit']")).click();*/
}
}

