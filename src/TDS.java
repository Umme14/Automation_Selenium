import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TDS {
	WebDriver driver;
	@Test
	@SuppressWarnings("deprecation")
	public void setup() throws InterruptedException
	{
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

wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Report"))).click();
driver.findElement(By.linkText("PF/IT")).click();
//wait.until(ExpectedConditions.elementToBeClickable(By.className("nav-link active"))).click();
Actions action = new Actions(driver);
WebElement move = driver.findElement(By.linkText(" TDS Deduction Report"));
action.moveToElement((move)).click().build().perform();

driver.close();
}
}
