package Testexampledemo;

import org.testng.annotations.Test;

public class Prioritytestcase {
  @Test(groups= {"Functional testing","Regression Testing"})
  public void testcase1() {
	  System.out.println("Test case 1");
  }
  @Test(priority=1,invocationCount=3,invocationTimeOut=5)
  public void testcase2() {
	  System.out.println("Test case 2");
  }
  @Test(priority=2,description= "Logout of the application")
  public void testcase3() {
	  System.out.println("Test case 3");
  }
}
