package cucumber1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitwait {
	@Test
	public void exmplicit() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	driver.findElement(By.id("username")).sendKeys("Asuran");
	driver.findElement(By.id("password")).sendKeys("Chithambaram123");
	WebDriverWait wait = new WebDriverWait(driver,15);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")));
	driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	Thread.sleep(2500);
	driver.quit();
	
	}
}
