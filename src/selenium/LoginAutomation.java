package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginAutomation {

public static void main() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/users/sign_up");
Thread.sleep(3000);
driver.findElement(By.id("user_full_name")).sendKeys("UmmeHani");
Thread.sleep(3000);
driver.findElement(By.id("user_email_login")).sendKeys("abc223@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("user_password")).sendKeys("u14hani");
Thread.sleep(3000);
driver.findElement(By.id("tnc_checkbox")).click();
Thread.sleep(3000);
driver.findElement(By.id("user_submit")).click();
driver.close();
}
}