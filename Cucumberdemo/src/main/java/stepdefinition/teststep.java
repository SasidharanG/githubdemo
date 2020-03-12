package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep 
{
	WebDriver driver;

	@Given("^Login to the linkedin page$")
	public void openlinkedinpage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1208\\Desktop\\Selenium/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().window().maximize();
	}
	@When("^Enter the username and password$")
	public void usernamepassword()
	{   
		driver.findElement(By.id("username")).sendKeys("moses");
		driver.findElement(By.id("password")).sendKeys("1230");
		
	}
	@Then("^It display the error and quit$")
	public void signin()
	{
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
		driver.quit();
	}
}


