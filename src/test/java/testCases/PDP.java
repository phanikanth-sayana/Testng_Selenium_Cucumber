package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import router.SuiteLauncher;
import supportingClasses.DriverHandler;
import supportingClasses.ScreenHandler;

public class PDP
{
	static WebDriver driver;
	ScreenHandler scr = new ScreenHandler();
	DriverHandler drv = new DriverHandler();
	SuiteLauncher suite = new SuiteLauncher();
	

	@Test
	  public void HYBRIS_966() throws Exception
	  {
		driver = drv.ReturnFirefoxDriver(driver);
		driver.get("http://www.gmail.com");
		ExtentTest test = suite.extent.startTest(suite.testData.get("JIRA Test Case ID"),suite.testData.get("Summary"));
		test.assignAuthor(suite.testData.get("Author"));
		test.assignCategory(suite.testData.get("Sprint"));
		test.log(LogStatus.INFO, "browser : Firefox");
		test.log(LogStatus.INFO, "version : 51.0.1");
		test.log(LogStatus.PASS, "Error msg appeared as expected for an invalid user name"+test.addScreenCapture(scr.getscreenshot(driver)));
		suite.extent.endTest(test);
		driver.quit();
	  }
	
	@Test
	  public void HYBRIS_967() throws Exception
	  {
		driver = drv.ReturnFirefoxDriver(driver);
		driver.get("http://www.gmail.com");
		ExtentTest test = suite.extent.startTest("HYBRIS-967","Verify the presence of alternate images below main image on PDP page.");
		test.assignAuthor("pradeep kumar");
		test.assignCategory("Testing - Ecomm R2");
		test.log(LogStatus.INFO, "browser : Firefox");
		test.log(LogStatus.INFO, "version : 51.0.1");
		test.log(LogStatus.FAIL, "Error msg appeared as expected for an invalid user name"+test.addScreenCapture(scr.getscreenshot(driver)));
		suite.extent.endTest(test);
		driver.quit();
	  }
	
	@Test
	  public void HYBRIS_969()
	  {
		  
	  }
	
	@Test
	  public void HYBRIS_1689()
	  {
		  
	  }
	
	@Test
	  public void HYBRIS_2980()
	  {
		  
	  }
}
