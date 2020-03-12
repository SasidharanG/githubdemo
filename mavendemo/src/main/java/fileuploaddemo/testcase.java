package fileuploaddemo;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	String Baseurl,nodeurl;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		Baseurl="";
		nodeurl="";
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver =new RemoteWebDriver(new URL(nodeurl),capability);
	}
	public void aftertest()
	{
		driver.quit();
	}
@Test
public void simpletest()
{
	driver.get(Baseurl);
	String a=driver.getTitle();
	System.out.println("Title of the page"+a);
}
}



