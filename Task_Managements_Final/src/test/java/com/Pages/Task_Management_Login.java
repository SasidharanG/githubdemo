package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task_Management_Login {
	//login
	WebDriver driver;
	By Administration=By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.name("DoLogin");
	
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
			else if (browser.equalsIgnoreCase("Internet Explore")) {
					System.setProperty("webdriver.ie.driver","src//test//resources//Driver//IEDriverServer.exe");
				driver=new InternetExplorerDriver();  
			}
       //to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println("Browser could not be launched");
		}
	}
	public void LoginPage()
	{
		driver.findElement(Administration).click();
		
	}
	
	public void LoginDetails(String login, String Pass) throws IOException
	{
		driver.findElement(Login).sendKeys(login);
		driver.findElement(Password).sendKeys(Pass);
	}
	public void loginclick()
	{
		driver.findElement(Loginclick).click();
		driver.close();
	}
	
	
}
