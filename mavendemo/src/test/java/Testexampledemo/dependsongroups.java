package Testexampledemo;

import org.testng.annotations.Test;

public class dependsongroups {
@Test(groups= {"functional testing","retesting testing"})
public void testcase1()
{
	System.out.println("Test case 1");
}
@Test(groups= {"functional testing","smoke testing"})
public void testcase2()
{
	System.out.println("Test case 2");
}
@Test(groups= {"regression testing","smoke testing"})
public void testcase3()
{
	System.out.println("Test case 3");
}
	
}
