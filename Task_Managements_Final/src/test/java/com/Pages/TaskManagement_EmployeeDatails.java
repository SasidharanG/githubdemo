package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TaskManagement_EmployeeDatails {
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
	public void adminstration() {
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.name("login")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("DoLogin")).click();
	}
	
	public void employe() {
		driver.findElement(By.linkText("Employees")).click();
		
	}
	public void printemp() throws InterruptedException {
		String empname = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td[1]/a")).getText();
		String email = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td[3]/a")).getText();
		System.out.println("Employee Deatils \n Employe name: "+empname+ "\n Employee Mailid: "+email);
		Thread.sleep(3000);
		driver.close();
	}
	
}
