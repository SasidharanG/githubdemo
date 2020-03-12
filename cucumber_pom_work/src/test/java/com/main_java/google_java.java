package com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google_java {
WebDriver driver;
WebElement textbox;

public void url()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
}
public void google_homepage()
{
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
}
public void verify() throws InterruptedException
{
 textbox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
 if(textbox.isEnabled())
 {
	 textbox.sendKeys("Steven Smith");
	 Thread.sleep(3000);
 }
}
public void search() throws InterruptedException
{
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER);
	Thread.sleep(3500);
	driver.close();
	
	
}
}
