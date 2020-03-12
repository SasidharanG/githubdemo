package Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import pages.linkedinsignin;

public class linkedin_signin_testcase extends WrapperEx {
	@BeforeClass
	public void startUp() 
	{
	 launchApplication("firefox","https://www.linkedin.com/login");	
	}
	@Test
	public void signin()
	{
		linkedinsignin lsign = new linkedinsignin(driver);
		lsign.signinToApp_username("Sasi");
		lsign.signinToApp_password("123murukks");
		lsign.signinToApp_signinbutton();
		
	}
	@AfterClass
	public void closeapp()
	{
		quit();
	}

}
