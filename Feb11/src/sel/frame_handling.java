package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://jqueryui.com/draggable/");
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  //System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).isDisplayed());
		  //driver.switchTo().defaultContent();
		//  driver.findElement(By.className("jquery-ui page page-id-25 page-template-default page-slug-draggable single-author singular/")).click();
	      WebElement a = driver.findElement(By.id("draggable"));
	      WebElement b = driver.findElement(By.id("droppable"));
	      Actions gst = new Actions(driver);
	      gst.dragAndDrop(a, b).build().perform();
	      
	}

}
