package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		System.out.println(driver.findElement(By.tagName("img")).getSize());
		String s=driver.getTitle();
		String c="OrangeHRM";
		if(s.equalsIgnoreCase(c))
		{
			System.out.println("Test Successful");
		}
		else
			System.out.println("Test Failed");
	}

}