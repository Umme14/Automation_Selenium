import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class error {
	@Test

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
		driver.manage().window().maximize();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		String actual_error=driver.findElement(By.className("o6cuMc")).getAttribute("innerHTML");
		String expected_error="Enter an email or phone number";
		Assert.assertEquals(actual_error, expected_error);
	Assert.assertTrue(actual_error.contains("asfaad"));
		System.out.println("Test Completed");
	}

}
