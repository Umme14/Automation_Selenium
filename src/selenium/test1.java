package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.flipkart.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Dimension num = driver.findElement(By.tagName("a")).getSize();	
			Thread.sleep(3000);
			System.out.print("Number of links" +num);
			driver.close();
			
	}

}

