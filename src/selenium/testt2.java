package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testt2 {

	WebDriver driver;
	 @SuppressWarnings("deprecation")
	@BeforeTest
	    public void openMain()
	    {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.lambdatest.com/");
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	        
	         driver.findElement(By.xpath("//a[contains(text(),'Start Free Testing')]")).click();
	        
	        
	    }
	  @SuppressWarnings("deprecation")
	@BeforeMethod
	    public void verifyElemntsOnPageTest()
	    {
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        
	    
	    	WebElement lambdaTestLogo = driver.findElement(By.xpath("//img[@class='xxxl:w-210 xxl:w-180 w-150 h-auto']"));
	    	lambdaTestLogo.isDisplayed();
	    	
	    	WebElement signUpTitle = driver.findElement(By.xpath("//span[@class='xxxl:text-size-16 xxl:text-size-14 text-size-12 orsignup bg-white py-0 px-34 tracking-normal font-medium text-gray-500']"));
	    	signUpTitle.isDisplayed();
	    	
	    	WebElement termsText = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	    	termsText.isDisplayed();
	    	
	    	WebElement loginLinkText = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
	    	loginLinkText.isDisplayed();
	    	
	    }
	  // Registration with all valid data
	    @Test(priority=1)
	    public void validRegistrationTest(){            
	              
	        WebElement companyName = driver.findElement(By.name("organization_name"));
	        companyName.sendKeys("TestCompany");
	       
	             
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.sendKeys("TestName");
	             
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("ummehani16@gmail.com");
	        
	         
	        WebElement password = driver.findElement(By.name("password"));
	        password.sendKeys("Test@12345");
	 
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.sendKeys("9876543210");
	        WebElement drop=driver.findElement(By.id("designation"));
	        
	       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	    }
	       
	        
	        
	    
	    /*@Test (priority=2)
	    public void logout()
	    {
	    driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
	    
	    	WebElement log = driver.findElement(By.linkText("Logout"));
	    	log.click();
	    }*/
	        @Test(priority=2)
	        public void emptyCompanyNameTest()
	        {
	        	
	        	 WebElement companyName = driver.findElement(By.name("organization_name"));
	        	 companyName.clear();
	  	        
	        	 
	             companyName.sendKeys("");
	                  
	             WebElement fullName = driver.findElement(By.name("name"));
	             fullName.clear();
		  	      
		  	        
	             fullName.sendKeys("TestName");
	                  
	             WebElement email = driver.findElement(By.name("email"));
	             email.clear();
		  	      
	             email.sendKeys("test7.lambdatest@gmail.com");
	              
	             WebElement password = driver.findElement(By.name("password"));
	             password.clear();
		  	       
	             password.sendKeys("Test@12345");
	      
	             WebElement phone = driver.findElement(By.name("phone"));
	            phone.clear();
		  	        
	             phone.sendKeys("9876543210");
	                 
	             WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
	             termsOfServices.clear();
		  	     
	             termsOfServices.click();
	                   
	             WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
	             signUp.clear();
	             signUp.click();
	        
	        
	        
	    }
	    
}