package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskManagement_DeleteTaskSearch {
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
		public void searchdata() {
			Select assign = new Select(driver.findElement(By.name("assign_to")));
			assign.selectByValue("4");
			Select project = new Select(driver.findElement(By.name("project_id")));
			project.selectByValue("1");
			Select status = new Select(driver.findElement(By.name("status_id")));
			status.selectByValue("3");
		}
		public void submit() {
			driver.findElement(By.name("DoSearch")).click();
		}
		
		public void print() throws InterruptedException
		{
			String norecord =driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td/table[2]/tbody/tr[2]/td")).getText();
			System.out.println("Printing the result of deleted task search " +norecord);
			Thread.sleep(3000);
			driver.close();
		}
}
