package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	@Test(priority=2,enabled=true,groups={"sanity"})
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority=1,enabled=false)
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=3,groups={"smoke"})
	public void test3()
	{
		System.out.println("Test3");
	}
	

	// Before Method will run before every test
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Run before every Test");
	}

	// After Method will run after every test
	@AfterMethod
	public void afterMethod() {
		System.out.println("Run after every Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	

}
