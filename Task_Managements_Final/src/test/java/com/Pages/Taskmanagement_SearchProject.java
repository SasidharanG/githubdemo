package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskmanagement_SearchProject {
	WebDriver driver;                      
	public void ChromeLaunch(String browser,String url)
	{
	
		try {
			//To launch firefox BROWSER
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// TO launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("Internet Explore")) {
					System.setProperty("webdriver.ie.driver","src/test/resources/Driver/IEDriverServer.exe");
				driver=new InternetExplorerDriver();  
			}
       //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		}
		catch (WebDriverException e) 
		{
			System.out.println("Browser could not be launched");
		}
	}
	public void searchproject() {
		Select se = new Select(driver.findElement(By.name("project_id")));
		se.selectByValue("1");
	}
	public void submit() throws InterruptedException {
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
