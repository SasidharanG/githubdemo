package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Mangement_Search {
		WebDriver driver;
		By assign=By.name("assign_to");
		By Project=By.name("project_id");
		By Priority=By.name("priority_id");
		By status=By.name("status_id");
		By type=By.name("type_id");
		By search=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[6]/td/input");
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
		
		public void searchdetails()
		{
			Select pro =new Select(driver.findElement(assign));
			pro.selectByValue("20");
			Select pri =new Select(driver.findElement(Project));
			pri.selectByValue("2");
			Select Sta =new Select(driver.findElement(Priority));
			Sta.selectByValue("4");
			Select ty =new Select(driver.findElement(status));
			ty.selectByValue("4");
			Select as =new Select(driver.findElement(type));
			as.selectByValue("2");
		}
		public void  search() throws InterruptedException {

			driver.findElement(search).click();
			Thread.sleep(3000);
			driver.close();
		}

}
