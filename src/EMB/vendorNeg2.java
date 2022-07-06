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

public class vendorNeg2 {
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
public void emptyPartyName() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562014");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Name Required";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of name is not present", actual,expected);

}
@Test(priority=2)
public void emptyEmail() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Please Enter Email";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of email is not present", actual,expected);

}
@Test(priority=3)
public void invalidEmail() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Please Enter A Valid Email";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of email is not present", actual,expected);

}
@Test(priority=4)
public void existedEmail() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Email id already available";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of email is not present", actual,expected);

}
@Test(priority=5)
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
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Please Enter Mobile Number";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of phone is not present", actual,expected);

}
@Test(priority=7)
public void emptyNick() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Name Required";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of name is not present", actual,expected);

}
@Test(priority=6)
public void existedPhone() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562015");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Either Mobile Or Email Is Already Exists.";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of phone is not present", actual,expected);

}
@Test(priority=8)
public void emptyDOB() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Please Enter Date Of Birth";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of DOB is not present", actual,expected);

}
@Test(priority=9)
public void lessDOB() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/2005");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("15454");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Your Age less than 18";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of Dob is not present", actual,expected);

}
@Test(priority=10)
public void emptyPassword() throws InterruptedException {
	driver.findElement(By.xpath("//img[@src='./assets/img/dash/emb.png']")).click();
	driver.findElement(By.linkText("Administration")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Master Data']")).click();
	
	driver.findElement(By.linkText("Vendors/Contractors")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='Create New Legal Entity']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/app-administration[1]/app-party[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();
	driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Individual']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Name']")).sendKeys("sdac");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Email']")).sendKeys("xyz1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter Party Phone Number']")).sendKeys("7548562011");
	driver.findElement(By.xpath("//input[@placeholder='Party Name']")).sendKeys("aaaa");
	driver.findElement(By.xpath("//input[@placeholder='Enter DOB']")).sendKeys("05/05/1993");
	driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("");
	driver.findElement(By.xpath("//div[@id='tab-7-4']//button[@class='btn btn-primary'][normalize-space()='Submit']")).click();
	String actual = "Please Enter Password";
	String expected = driver.findElement(By.id("swal2-content")).getText();
	Assert.assertEquals("Validation of password is not present", actual,expected);

}
@AfterMethod
public void close() {
	driver.close();
}



}
