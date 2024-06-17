package selenium.utils;

import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseTest {

	public static WebDriver driver;
	public JavascriptExecutor jse;
	
	@Parameters({"appUrl"})
	@BeforeClass
	public void setup(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://keybooks.ro");
		driver.get(url);
		jse = (JavascriptExecutor) driver;
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown() throws InterruptedException  {
		Thread.sleep(5000);//bad practice
		driver.quit();
	}
	
	
	
}