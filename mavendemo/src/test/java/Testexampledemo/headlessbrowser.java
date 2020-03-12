package Testexampledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessbrowser {
	@Test
	public void login()
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://in.yahoo.com/");
		System.out.println(driver.getTitle());
	}

}
