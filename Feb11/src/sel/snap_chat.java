package sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class snap_chat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/BLTuser.BLT1208/Desktop/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		//C:\Users\BLTuser.BLT1208\eclipse-workspace\Feb11
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
	//takes screenshot of the first appearing page of the linked in profile first page
		FileUtils.copyFile(source,new File("C:\\Users\\BLTuser.BLT1208\\eclipse-workspace\\Feb11\\Screenshot\\fb.png"));
	}
}
