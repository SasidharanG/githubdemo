package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_Management_SearchClosed {
 WebDriver driver;
 By Status = By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[4]/td/select");
 By Search = By.name("DoSearch");
	public void ChromeLaunch(String browser,String url)
	{
		try {
			//To launch firefox BROWSER
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src//test//resources//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			// TO launch Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			
       //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println("Browser could not be launched");
		}
	}
	
	public void search_table() throws InterruptedException
	{
		driver.findElement(Status).click();
		driver.findElement(Status).sendKeys(Keys.DOWN);
		driver.findElement(Status).sendKeys(Keys.ENTER);
		driver.findElement(Search).click();
		Thread.sleep(4000);
		driver.close();
	}
	
}
