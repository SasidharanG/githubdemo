package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1208/Desktop/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@class='db text-trans-uc']")).click();
//		driver.findElement(By.xpath("//*[@class='past day']")).click();
		//driver.findElement(By.id("src")).sendKeys("RAMESWARAM");
		//driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("RAMESWARAM");

		Select day = new Select (driver.findElement(By.id("day")));
		day.selectByValue("3");
		Select month = new Select (driver.findElement(By.id("month")));
		month.selectByValue("12");
		Select year = new Select (driver.findElement(By.id("year")));
		year.selectByValue("2020");
		
	}

}
