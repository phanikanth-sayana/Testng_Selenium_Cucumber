package supportingClasses;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenHandler 
{
	public String getscreenshot(WebDriver driver) throws Exception 
	  {
	          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         
	          
	          long sysTime = System.currentTimeMillis();
	          
	          String filePath = "C:\\Users\\phani.kanth.sayana\\screen shots\\"+sysTime+".png";
	          
	          FileUtils.copyFile(scrFile, new File(filePath));
	         // String fileName = scrFile.toPath().toString();
	          
	          return filePath;
	       //The below method will save the screen shot in d drive with name "screenshot.png"
	          //FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
	  }

}
