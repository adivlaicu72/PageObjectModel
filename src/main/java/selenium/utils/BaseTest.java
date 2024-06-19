package selenium.utils;

<<<<<<< HEAD
=======
import java.io.File;
import java.text.SimpleDateFormat;
>>>>>>> curs27
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

<<<<<<< HEAD
=======
import com.google.common.io.Files;



>>>>>>> curs27
public class BaseTest {

	public static WebDriver driver;
	public JavascriptExecutor jse;

	
	@Parameters({"appUrl"})
	@BeforeClass(alwaysRun = true)
	public void setup(String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
<<<<<<< HEAD
	//	driver.get("https://keybooks.ro");
=======
		//driver.get("https://keybooks.ro");
>>>>>>> curs27
		driver.get(url);
		jse = (JavascriptExecutor) driver;
	}
	
<<<<<<< HEAD
=======

>>>>>>> curs27
	@AfterClass(alwaysRun = true)
	public void tearDown() throws InterruptedException  {
		Thread.sleep(5000);//bad practice
		driver.quit();
	}
	
	@AfterMethod
	public void recordFailure(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			TakesScreenshot obj = (TakesScreenshot) driver;
			File picture = obj.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
			
			try {
				
				Files.copy(picture, new File("poze/"+result.getName() +"-"+timestamp+".png"));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}