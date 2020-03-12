package com.Testcase;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Download_IE_driver;
import com.Pages.Selenium_IE_driver_page;

public class Selenium_IE_driver_test extends Download_IE_driver 
{
  @BeforeClass
  public void startup()
  {
	  //The browser and the required webpage launches here
	  launch("chrome","https://www.seleniumhq.org/");
  }
  @Test
  public void click_func() throws InterruptedException
  {
	  Selenium_IE_driver_page sel = new Selenium_IE_driver_page(driver);
	  //The click functions are performed here
	  sel.click_download();
	  Thread.sleep(4000);
  }
  @Test
  public void Assert_print()
  {   
	  String filename = "IEDriverServer_x64_3.150.1";
	  //Declaring the file path where the zip file is stored
	  File fil = new File("C:\\Users\\BLTuser.BLT1208\\Downloads\\IEDriverServer_x64_3.150.1");
	  //Compares the given filename and the downloaded filename stored in the above filepath
	  Assert.assertEquals(filename,fil.getName());
	  System.out.println(fil.getName());
	  //Prints the Assert Message
	  System.out.println("The 64 Bit ZIP file is successfully downloaded");
  }
  @AfterClass
  public void close_browser() throws IOException
  {  
	  //Takes the screenshot and stores in the below folder
	  screenshot("Screenshot\\seleniumhq.png");
	  //Closes the browser
	  quit();
  }
}
