import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboard {
	@Test
	public void key()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://in.linkedin.com/");
	driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	driver.findElement(By.id("username")).sendKeys("Valimai");
//	driver.findElement(By.id("password")).sendKeys("Thala143");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys("Thala143").perform();
	action.sendKeys(Keys.RETURN).perform();
	
	}
}
