package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterization {
    
	
	 
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
	 
	return new Object[][] { { "1. Sandeep" }, { "2. Swapnil" }, { "3. Nisha" } };
	      }
	 
	@Test(dataProvider = "data-provider")
	public void testMethod(String data) {
	 
	System.out.println("Data is: " + data);
	      }
	}


