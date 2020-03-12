package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wrapper_methods {
	WebDriver driver;
	public void launchapp(String url)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
  public void clickbyxpath(String path)
  {
	  driver.findElement(By.xpath(path)).click();
  }
public void entrybid(String loc, String value)
{
	driver.findElement(By.id(loc)).sendKeys(value);
}
public void screenshot(String path1)
{
	TakesScreenshot ts = ((TakesScreenshot)driver);
}
public void closeapp()
{
	driver.close();
}

}
