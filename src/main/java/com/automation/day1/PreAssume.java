package com.automation.day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PreAssume {

	@Test
	public static void test3() {
		System.out.println("heyy abhayawaaa");
	}
	
	@DataProvider
	public static void getData() {
		System.out.println("heyy getData");
	}
}
