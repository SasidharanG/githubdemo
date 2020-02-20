package gradle1stwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basictest {
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://in.linkedin.com/");
}
}
