

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {

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
	 @Test (priority=1)
	    public void verifyElemntsOnPageTest()
	    {
			WebElement lambdaTestLogo = driver.findElement(By.xpath("//img[@class='xxxl:w-210 xxl:w-180 w-150 h-auto']"));
	    	lambdaTestLogo.isDisplayed();
	    	
	    	WebElement signUpTitle = driver.findElement(By.xpath("//span[@class='xxxl:text-size-16 xxl:text-size-14 text-size-12 orsignup bg-white py-0 px-34 tracking-normal font-medium text-gray-500']"));
	    	signUpTitle.isDisplayed();
	    	
	    	WebElement termsText = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	    	termsText.isDisplayed();
	    	
	    	WebElement loginLinkText = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
	    	loginLinkText.isDisplayed();
	    	
	    }
	    
	    //Verifying redirection to the terms and conditions page
	    @Test (priority=2)
	    public void termsRedirectionTest()
	    {
	    	WebElement termsLink = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	    	termsLink.click();    	
	    	
	    	Set <String> allWindows = driver.getWindowHandles();
	    	
	    	for(String handle : allWindows)
	    	{
	    		driver.switchTo().window(handle);
	    	}  
	    }
	    	  	
	    
	    
	    //Verifying Privacy policy page redirection
	    @Test (priority=3)
	    public void privacyPolicyRedirectionTest()
	    {
	    	WebElement privacyPolicyLink = driver.findElement(By.linkText("Privacy Policy"));
	    	privacyPolicyLink.click();
	    	
	    	Set <String> allWindows = driver.getWindowHandles();
	    	
	    	for(String handle : allWindows)
	    	{
	    		driver.switchTo().window(handle);
	    	}    	        	
	    	  	
	    
	    }    
	    
	    //Verifying redirection to the Login page from Registration page
	    @Test (priority=5)
	    public void loginRedirectionTest()
	    {
	    	WebElement loginLink = driver.findElement(By.linkText("Start Free Testing"));
	    	loginLink.click();
	    	
	    	
	    		
	    }
	    
	    //Verifying redirection to the landing page
	 /*  @Test (priority=4)
	    public void landingPageRedirectionTest()
	    {
	    	WebElement lambdaTestLogo = driver.findElement(By.xpath("//p[@class='logo-home']//a//img"));
	    	lambdaTestLogo.click();
	    	
	    	
	    }*/
	  
	    // Registration with all valid data
	    @Test (priority=15)
	    public void validRegistrationTest(){            
	              
	        WebElement companyName = driver.findElement(By.name("organization_name"));
	        companyName.sendKeys("TestCompany");
	             
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.sendKeys("TestName");
	             
	        WebElement email = driver.findElement(By.name("email"));
	        email.sendKeys("trueprogrammer2@gmail.com");
	         
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
	    
	    // Registration without providing Company Name field
	    @Test (priority=6)
	    public void emptyCompanyNameTest()
	    {
	    	 WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	         companyName.clear();
	    	 companyName.sendKeys("");
	              
	         WebElement fullName = driver.findElement(By.name("name"));
	         fullName.clear();
	         fullName.sendKeys("TestName");
	              
	         WebElement email = driver.findElement(By.name("email"));
	         email.clear();
	         email.sendKeys("trueprogrammer1@gmail.com");
	          
	         WebElement password = driver.findElement(By.name("password"));
	         password.clear();
	         password.sendKeys("Test@12345");
	  
	         WebElement phone = driver.findElement(By.name("phone"));
	         phone.clear();
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
	    
	    // Registration without providing Name field
	    @Test (priority=7)
	    public void emptyNameTest() throws InterruptedException
	    {
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	        companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	       
	        termsOfServices.click();
	            Thread.sleep(3000);  
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        
	        String expectedErrorMsg = "Please enter your name";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[normalize-space()='Please enter your name']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	        
	    }
	    
	    // Registration without providing user email field
	    @Test (priority=8)
	    public void emptyEmailTest() throws InterruptedException
	    {
	    	WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	    	companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("test");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	       
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        
	        String expectedErrorMsg = "Please enter your email address";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[normalize-space()='Please enter your email address']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    }
	    
	    // Registration with email id which already have account
	    @Test (priority=9)
	    public void invalidEmailTest() throws InterruptedException
	    {
	        
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	        companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	            
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	       
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        String expectedErrorMsg = "The email must be a valid email address.";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[normalize-space()='The email must be a valid email address.']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    }
	    
	    // Registration without providing password field
	    @Test (priority=10)
	    public void emptyPasswordTest() throws InterruptedException
	    {
	    	WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	    	 companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	            
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	      
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        String expectedErrorMsg = "Please enter a desired password";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please enter a desired password')]"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    }
	    
	    // Registration with invalid password
	    @Test (priority=11)
	    public void inValidPasswordTest() throws InterruptedException
	    {
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	        companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("T");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	        
	            
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	        
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        String expectedErrorMsg = "Password should be at least 8 characters long";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Password should be at least 8 characters long')]"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    	//Password should be at least 8 characters long
	    }
	  
	    // Registration without providing user phone number field
	    @Test (priority=12)
	    public void emptyPhoneTest()
	    {
	    	WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	    	companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("");
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	       
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        
	        String expectedErrorMsg = "Please enter your phone";
	        
	        WebElement exp = driver.findElement(By.xpath("//p[normalize-space()='Please enter your phone']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	    }
	    
	    // Registration with providing invalid user phone number field
	    @Test (priority=13)
	    public void inValidPhoneTest() throws InterruptedException
	    {
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	        companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("98");
	            
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	        
	        termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        
	        String expectedErrorMsg = "Please enter your phone";
	        		
	        
	        WebElement exp = driver.findElement(By.xpath("//p[normalize-space()='Please enter your phone']"));
	        String actualErrorMsg = exp.getText();
	        		
	        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	        
	    	//Please enter a valid Phone number
	    }
	    
	    // Registration without accepting terms and condition tickbox
	    @Test (priority=14)
	    public void uncheckedTerms() throws InterruptedException
	    {
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='organization_name']"));
	        companyName.clear();
	        companyName.sendKeys("TestCompany");
	          
	        WebElement fullName = driver.findElement(By.name("name"));
	        fullName.clear();
	        fullName.sendKeys("TestName");
	         
	        WebElement email = driver.findElement(By.name("email"));
	        email.clear();
	        email.sendKeys("test@test.com");
	                 
	        WebElement password = driver.findElement(By.name("password"));
	        password.clear();
	        password.sendKeys("Test@123");
	          
	        WebElement phone = driver.findElement(By.name("phone"));
	        phone.clear();
	        phone.sendKeys("9876543210");
	            
	        WebElement drop=driver.findElement(By.id("designation"));
	        
		       
			//Object instantiation for selecting values from dropDown
			Select dropdown = new Select(drop);

			//Select value from the  DropDown
			dropdown.selectByVisibleText("Student / Freelancer");
			 Thread.sleep(3000); 
	            
	        //WebElement termsOfServices = driver.findElement(By.id("i-agree"));
	       // termsOfServices.click();
	              
	        WebElement signUp = driver.findElement(By.id("signup-button"));
	        signUp.click();
	        
	        String expectedTermsErrorMessage = "Please accept Privacy Policy & Terms of Service";
	        WebElement uncheckedTermCheckbox = driver.findElement(By.xpath("//p[normalize-space()='Please accept Privacy Policy & Terms of Service']"));
	    	String actualTermsErrorMessage = uncheckedTermCheckbox.getText();
	        //To proceed further you must agree to our Terms of Service and Privacy Policy
	    	
	    	Assert.assertEquals(actualTermsErrorMessage, expectedTermsErrorMessage);
	    }
	    
	    // Closing the browser session after completing each test case
	    @AfterClass
	    public void tearDown()  {
	      
	            driver.quit();
	        }
	    }
	