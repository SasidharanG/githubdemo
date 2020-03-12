import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBar {

    
    @Test
    public void ByPixel() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://in.linkedin.com/");
       
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,3000)");
      
    }
}