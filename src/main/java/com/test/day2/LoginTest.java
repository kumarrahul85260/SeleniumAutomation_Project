package com.test.day2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	
	@BeforeMethod
	public void setUp() {
		System.out.println("launching the browsers.....");
	}
	@Test
	public void getTitle() {
		Assert.assertEquals(true,false);
				
		}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("closing the browwser");
	}
}
