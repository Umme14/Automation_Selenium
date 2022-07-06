import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
 
//import io.github.bonigarcia.wdm.WebDriverManager;
 
public class printpdf {
 
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCSMCPL\\Downloads\\chromedriver.exe");
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setAcceptInsecureCerts(true);
	
	// WebDriver driver = new ChromeDriver();
	
 
 
ChromeOptions opt = new ChromeOptions();
opt.addArguments("headless");

//WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(opt);
driver.get("https://selenium.dev/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
Files.write(Paths.get("./selenium.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));

 
}
 
}
