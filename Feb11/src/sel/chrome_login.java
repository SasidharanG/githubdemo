package sel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.findElement(By.className("nav__base")).click();


	}

}
