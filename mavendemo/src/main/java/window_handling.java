import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class window_handling 
{
	@Test
	public void irctclogin()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.linkText("CONTACT US")).click();
	Set<String>winHandles = driver.getWindowHandles();
	System.out.println("The number of window handles are" +winHandles.size());
	for(String winHandle:winHandles) 
	{
		
	driver.switchTo().window(winHandle);
}
	String title = driver.getTitle();
	System.out.println("The page is "+title);
	driver.quit();
	
	}
	}
