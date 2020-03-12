package sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.hdfcbank.com//");
		driver.manage().window().maximize();
		driver.get("https://busindia.com/");
        driver.findElement(By.xpath("//*[@id=\"tabMain\"]/div[4]/div[1]/div/div/div/div/div[6]/button")).click();
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();//this is to click ok button in exception throw message
        //a.dismiss();//this is to cancel exception message displayed
        a.sendKeys("Sasi");//for passing values
        driver.close();
	}

}
