package com.ronyb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void test1() throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			Thread.sleep(500);
		}
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			Assert.assertTrue(i < 3, "i must be smaller than 3");
			Thread.sleep(500);
		}
	}
}
