package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import supportingClasses.DriverHandler;
import supportingClasses.ScreenHandler;

public class OrderHistory
{
	static WebDriver driver;
	static ExtentReports extent;
	ScreenHandler scr = new ScreenHandler();
	DriverHandler drv = new DriverHandler();
	
	@Test
	  public void HYBRIS_969() throws Exception
	  {
		drv.ReturnFirefoxDriver(driver);
		ExtentTest test = extent.startTest("HYBRIS-967","Verify the presence of alternate images below main image on PDP page.");
		test.assignAuthor("pradeep kumar");
		test.assignCategory("Testing - Ecomm R1");
		test.log(LogStatus.INFO, "browser : Firefox");
		test.log(LogStatus.INFO, "version : 51.0.1");
		test.log(LogStatus.PASS, "Error msg appeared as expected for an invalid user name"+test.addScreenCapture(scr.getscreenshot(driver)));
		extent.endTest(test);
		driver.quit();
	  }
	
	@Test
	  public void HYBRIS_1689() throws Exception
	  {
		drv.ReturnFirefoxDriver(driver);
		ExtentTest test = extent.startTest("HYBRIS-967","Verify the presence of alternate images below main image on PDP page.");
		test.assignAuthor("pradeep kumar");
		test.assignCategory("Testing - Ecomm R1");
		test.log(LogStatus.INFO, "browser : Firefox");
		test.log(LogStatus.INFO, "version : 51.0.1");
		test.log(LogStatus.PASS, "Error msg appeared as expected for an invalid user name"+test.addScreenCapture(scr.getscreenshot(driver)));
		extent.endTest(test);
		driver.quit();
	  }
	
	@Test
	  public void HYBRIS_2980() throws Exception
	  {
		drv.ReturnFirefoxDriver(driver);
		ExtentTest test = extent.startTest("HYBRIS-967","Verify the presence of alternate images below main image on PDP page.");
		test.assignAuthor("pradeep kumar");
		test.assignCategory("Testing - Ecomm R1");
		test.log(LogStatus.INFO, "browser : Firefox");
		test.log(LogStatus.INFO, "version : 51.0.1");
		test.log(LogStatus.PASS, "Error msg appeared as expected for an invalid user name"+test.addScreenCapture(scr.getscreenshot(driver)));
		extent.endTest(test);
		driver.quit();
	  }
	
}
