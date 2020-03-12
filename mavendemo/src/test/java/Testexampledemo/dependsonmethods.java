package Testexampledemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods {
@Test
public void login()
{
	System.out.println("Login to Application");
}
@Test(dependsOnMethods= {"login"})
public void search()
{
	System.out.println("Search the relevant searches");
	Assert.assertEquals("abc","xyz");
}
@Test(dependsOnMethods = {"search"},alwaysRun=true)
public void logout() {
	System.out.println("logout of the Application");
}
}
