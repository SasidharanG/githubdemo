package com.Pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Management_AddTask {
	WebDriver driver;
	By AddTask=By.xpath("/html/body/table[1]/tbody/tr[2]/td[2]/a/img");
	By Login =By.name("login");
	By Password=By.name("password");
	By Loginclick=By.name("DoLogin");
	By Task=By.name("task_name");
	By Description=By.name("task_desc");
	By Project=By.name("project_id");
	By Priority=By.name("priority_id");
	By Status=By.name("status_id");
	By Type=By.name("type_id");
	By Assingedto=By.name("user_id_assign_to");
	By StartDate=By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a");
	By SelectSdate=By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[7]/td[2]");
	By Finshdate =By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a");
	By SelectFdate=By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[7]/td[3]");
	By Addtask=By.name("Insert");
	
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
	public void LoginDetails(String login, String Pass) throws IOException, InterruptedException
	{
		driver.findElement(AddTask).click();
		Thread.sleep(3000);
		driver.findElement(Login).sendKeys(login);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(Loginclick).click();	
	}
	public void TaskDeatils() throws InterruptedException
	{
		driver.findElement(Task).sendKeys("Selenium");
		driver.findElement(Description).sendKeys("Selenium is automation tools. Selenium is a portable framework for testing web applications. Selenium provides a playback tool for authoring functional tests without the need to learn a test scripting language.");
		Select pro =new Select(driver.findElement(Project));
		pro.selectByValue("2");
		Select pri =new Select(driver.findElement(Priority));
		pri.selectByValue("4");
		Select Sta =new Select(driver.findElement(Status));
		Sta.selectByValue("4");
		Select ty =new Select(driver.findElement(Type));
		ty.selectByValue("2");
		Select as =new Select(driver.findElement(Assingedto));
		as.selectByValue("20");
		driver.findElement(StartDate).click();
		
		Set<String>winHandles=driver.getWindowHandles();
	    System.out.println("Size = "+winHandles.size());
	    
	    for(String winHandle:winHandles)
	    {
	    	System.out.println(winHandle);
	    	driver.switchTo().window(winHandle); 	
	    }
	    driver.findElement(SelectSdate).click();
	    
	    for(String winHandle:winHandles)
	    {
	    	driver.switchTo().window(winHandle); 
	    	break;
	    }
	    
	    Thread.sleep(3000);
	    driver.findElement(Finshdate).click();
	    Set<String>winHandles2=driver.getWindowHandles();
	    System.out.println("Size = "+winHandles2.size());
	    for(String winHandle2:winHandles2)
	    {
	    	driver.switchTo().window(winHandle2); 	
	    }
	    driver.findElement(SelectFdate).click();
	  
	    for(String winHandle2:winHandles2)
	    {
	    	driver.switchTo().window(winHandle2); 
	    	break;
	    }
	}
	public void AddTask() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(Addtask).click();
		driver.close();
	}

}
