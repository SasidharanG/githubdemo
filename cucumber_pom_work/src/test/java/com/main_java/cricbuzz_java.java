package com.main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cricbuzz_java {
	WebDriver driver;
	WebElement batsman;

	public void launchUrl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	public void moveActions()
	{
		Actions action = new Actions(driver);
		WebElement Rankings = null;
		action.moveToElement(Rankings);
	}
	public void batsman() throws InterruptedException
	{
		batsman = driver.findElement(By.xpath("//*[@id=\"rankingDropDown\"]/nav/a[1]"));
		batsman.click();
		Thread.sleep(3500);
	}
	public void quit() throws InterruptedException
	{
		Thread.sleep(4000);
	 driver.close();	
	}
}
