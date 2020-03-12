package Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Wrapper {
protected WebDriver driver;
	
	public void launchApplication(String browser, String url) {
		
		try {
			//launching firefox//
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}
			//launching chrome//
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} 
		catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
	}
	//takes screenshot//
	public void ScreenShot() throws IOException
	{
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\BLTuser.BLT1208\\eclipse-workspace\\TestFramework\\Screenshot"));
	}
	public void closeapp()
	{
		driver.close();
	}
}

