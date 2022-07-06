import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class button {
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


	driver.get("https://preprod.erp1.upda.co.in");
	Thread.sleep(3000);
	

	driver.findElement(By.name("email")).sendKeys("7778889999");
	driver.findElement(By.id("password")).sendKeys("User@1");
	driver.findElement(By.cssSelector("div[class='col-5 ng-star-inserted'] button[type='submit']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

	Thread.sleep(3000);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void button1() throws InterruptedException {
	
	 Actions actions = new Actions(driver);
	 WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("b_acct_id"))).click();
		
	        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='14 - Lucknow Development Authority']"));
	        actions.moveToElement(element).click().build().perform();
	        driver.findElement(By.xpath("//div[@id='multi_account']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	        Thread.sleep(3000);
	        System.out.println("come here 1");
	        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	        driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	        driver.findElement(By.xpath("//a[contains(@routerlink,'/emb/ebill-create')]//i[contains(@class,'fa-money')]")).click();
	       
	       // driver.findElement(By.partialLinkText("E-Bill List")).click();

	        
	        Actions Actions1 =new Actions(driver);
	        WebDriverWait wait1 = new WebDriverWait(driver,10);          
	        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-ebill-create[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ng-select[1]/div[1]"))).click();
	        Thread.sleep(2000);
	        WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'00/AA/GNV/2021 - Gomti Nagar Vistar Yojna Sector-7')]"));
	        Actions1.moveToElement(element1).click().build().perform();
	        Thread.sleep(2000);}
	
}