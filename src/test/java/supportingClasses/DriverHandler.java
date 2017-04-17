package supportingClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHandler
{
	public static WebDriver ReturnFirefoxDriver(WebDriver driver)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\phani.kanth.sayana\\Executables\\geckodriver.exe");
		driver = new FirefoxDriver();
	return driver;	
	}
	
	public static WebDriver ReturnChromeDriver(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phani.kanth.sayana\\Executables\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
