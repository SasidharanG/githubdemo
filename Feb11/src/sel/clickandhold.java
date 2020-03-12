package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement e3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		Actions vishal = new Actions(driver);
		vishal.clickAndHold(e1).clickAndHold(e4).release().build().perform();
		
	}

}
