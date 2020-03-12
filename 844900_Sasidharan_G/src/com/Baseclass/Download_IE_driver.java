package com.Baseclass;

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

public class Download_IE_driver {
	 protected WebDriver driver;
	   
	   public void launch(String browser,String url)
	   {
		   try
		   {    
			   //To Launch Firefox browser
			   if(browser.equalsIgnoreCase("firefox"))
			   {
				   System.setProperty("webdriver.gecko.driver","C:\\Users\\BLTuser.BLT1208\\eclipse-workspace\\844900_Sasidharan_G\\Driver\\geckodriver.exe");
				   driver = new FirefoxDriver();   
			   }
			   //To launch Chrome browser
			   else if(browser.equalsIgnoreCase("chrome"))
			   {
				   System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\eclipse-workspace\\844900_Sasidharan_G\\Driver\\chromedriver.exe");
				   driver = new ChromeDriver();
			   }
		   //To maximize the window
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   // The required Webpage link is passed here
		   driver.get(url);
		   }
		   catch(WebDriverException e)
		   {
			   //Must display in console if the try condition fails
			   System.out.println("The Browser could not be launched");
		   }
	   }
	   public void screenshot(String path) throws IOException
		 {   
		   //Syntax to capture Screenshot
			 TakesScreenshot shot = (TakesScreenshot)driver;
			 File SrcFile = shot.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(SrcFile, new File(path));
		 }
	   
	   public void quit()
	   {
		   //To quit the browser
		   driver.close();
	   }
		   
		   
	   

}
