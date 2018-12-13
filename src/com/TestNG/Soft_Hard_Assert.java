package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assert {
	
	String expected="Soft_Hard_Assert";
	Assertion hardAssert=new Assertion();
	SoftAssert softAssert=new SoftAssert();
	
	@Test
	public void hardAssertMethod()
	{
		hardAssert.assertTrue(true==true);
		hardAssert.assertEquals("Chandan","Chandan");
		System.out.println("hardAssertMethod Successfully passed!");
		
	}
	
	@Test
	public void softAssertMethod()
	{
		softAssert.assertEquals(true,true);
		softAssert.assertEquals("Chandan","Ghosh");
		softAssert.assertAll();
		System.out.println("SoftAssert method sucessfully passed");
	}

}
