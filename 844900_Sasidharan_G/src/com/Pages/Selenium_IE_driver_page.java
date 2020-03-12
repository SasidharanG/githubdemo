package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium_IE_driver_page 
{
      WebDriver driver;
 
      By Downloads_tab = By.linkText("Downloads");
      By Bit_click = By.xpath("/html/body/div[2]/div[2]/p/a[2]");

        public Selenium_IE_driver_page(WebDriver driver)
          { 
            this.driver=driver;	 
          }
 
        public void click_download() throws InterruptedException
          {
        	//The inspected click functions are called here
	       driver.findElement(Downloads_tab).click();
	       driver.findElement(Bit_click).click();
	       Thread.sleep(4000);
          }
 
 
}
