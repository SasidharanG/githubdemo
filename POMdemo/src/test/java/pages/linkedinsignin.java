package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class linkedinsignin {
	WebDriver driver;
	By username = By.id("username");
	By password =By.id("password");
	By signinbutton = By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	
   public linkedinsignin(WebDriver driver)
   {
	   this.driver=driver;
   }
   public void signinToApp_username(String userid)
   {
	   driver.findElement(username).sendKeys("Sasi");
   }
   public void signinToApp_password(String pass)
   {
	   driver.findElement(password).sendKeys("123murukks");
   }
   public void signinToApp_signinbutton()
   {
	   driver.findElement(signinbutton).click();
   }
  
}
