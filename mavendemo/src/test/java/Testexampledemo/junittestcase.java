package Testexampledemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class junittestcase {
	
	@Test
	public void testcase1() {
		System.out.println("testcase 1");
	}
	@Test
	public void testcase2() {
		System.out.println("testcase 2");
	}
	@Test
	public void testcase3() {
		System.out.println("testcase 3");
	}
	@Before 
	public void beforemethod()
	{
		System.out.println("Before method");
	}
   @After
   public void aftermethod()
   {
	   System.out.println("After method");
   }
   @BeforeClass
	public static void BeforeClass()
	{
		System.out.println("Before class");
	}
   @AfterClass
   public static void Afterclass()
   {
	   System.out.println("After class");
   }
}
