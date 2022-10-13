package com.capgemini.test.pack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDemo1 {
	//return type should be void as these are onlu for testing purpose
	@BeforeClass
	public static void callBeforeAnyTest()
	{
		System.out.println("calling only once befoire all test cases");
	}
	
	@Before
	public void callBeforeEachTestCase()
	{
		System.out.println("Calling before each test cases");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test Case 1....");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Test Case 2....");
	}
	
	@After
	public void afterEachTestCase()
	{
		System.out.println("After each test casses this method will be invoked");
	}
	
	@AfterClass
	public static void afterAllTestCase()
	{
		System.out.println("After all test cases this methpd will be invoked");
	}

}
