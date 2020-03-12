package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1208/Desktop/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
    // driver.findElement(By.className("header__logo")).click();
		//driver.findElement(By.id("username")).sendKeys("Sasi");
//driver.findElement(By.id("password")).sendKeys("555");
//driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();//absolute-Xpath
//driver.close();
//driver.quit();
//driver.findElement(By.linkText("Join now")).click();
//driver.findElement(By.partialLinkText("Join")).click();

/*firefox1.get("https://www.google.com/intl/en-GB/gmail/about/");*/
//driver.get("https://www.cricbuzz.com/");
     driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();//xpath for Post jobs format
     driver.findElement(By.xpath("//*[@id='first-name-ember18' and @type='text']")).sendKeys("Sasi");//xpath for entering firstname field in first name textbox
     driver.findElement(By.xpath("//*[@id='last-name-ember18' or @data-test-form-input='lastName']")).sendKeys("Amis");//xpath for entering lastname field in last name textbox
    driver.findElement(By.xpath("//*[contains(@id,'email-address-ember18')]")).sendKeys("sasi123@gmail.com");
     driver.findElement(By.xpath("//*[starts-with(@id,'password-ember18')]")).sendKeys("8825920798");
	 
	}

}
