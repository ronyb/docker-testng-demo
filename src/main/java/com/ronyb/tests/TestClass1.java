package com.ronyb.tests;

import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void test1() {
		String baseUrl = System.getenv("BASE_URL");
		System.out.println("baseUrl: " + baseUrl);
	}
}
