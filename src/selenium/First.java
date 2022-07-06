package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.gmail.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("identifierId")).sendKeys("umme14hani@gmail.com");
	 Thread.sleep(3000);
	 driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	 Thread.sleep(2000);
	 String at= driver.getTitle();
	 String et= "gmail";
	 System.out.println(at);
	 driver.close();
	 if(at.equalsIgnoreCase(et))
	 {
		 System.out.println("Test is Successfull");
		 
	 }
	 else
	 {
		 System.out.println("Failed");
	 }
		 
		

	}

}

