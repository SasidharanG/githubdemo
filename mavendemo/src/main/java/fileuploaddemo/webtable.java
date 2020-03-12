package fileuploaddemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class webtable {
	
@Test
public void table()
{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get( "https://www.cricbuzz.com/");
driver.findElement(By.xpath("//*[@id=\"rankingDropDown\"]/nav/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"batsmen-odis-tab\"]")).click();
//No. of columns
List  col = driver.findElements(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[2]/div[1]/div[2]"));
System.out.println("No of cols are : " +col.size()); 
//No.of rows 
List  rows = driver.findElements(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[2]/div[2]/div[1]")); 
System.out.println("No of rows are : " + rows.size());

	
	}



}
