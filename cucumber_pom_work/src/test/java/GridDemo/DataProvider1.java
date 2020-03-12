package GridDemo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider="Testdata")
	public void login(String username,String password  ) {
	 driver.findElement(By.id("email")).sendKeys(username);
	 driver.findElement(By.id("pass")).sendKeys(password);
	 driver.close();
	 
	}
	public ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
	}
	  @DataProvider(name="Testdata")
	  public Object[][] getdata() 
	  {
		  Object[][] data=new Object[3][2];
		  data [0][0] ="Haritha";
		  data [0][1] ="hari@123";
		  data [1][0] ="nani";
		  data [1][1] ="nani@123";
		  data [2][0] ="chaitu";
		  data [2][1] ="chaitu@123";
		  return data;
		  
	  }
	

}
