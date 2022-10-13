package com.capgemini.test.pack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import model.Customer;

public class TestQuestion2 {

	Customer cust;
	@Before
	public void start()
	{
		cust = new Customer("340000009988", "Khushal", "Swami", "qwertyuiop", 123456789, "qwerty@asd.zxc");
	}
	
	
	
	
	@Test
	public void TestgetFirstName()
	{
		String fname = cust.getFirstName();
		String lname = cust.getLastName();
		assertNotEquals(fname, lname);
		
	}
	
	@Test
	public void TestisValidAadharNo()
	{
		boolean b = Customer.isValidAadharNo("340000009988");
		assertTrue(b);
		boolean b1 = Customer.isValidAadharNo("123456789012");
		assertFalse(b1);
	}
	
	
	@Test
	public void TestgetEmailId()
	{
		String email = cust.getEmailId();
		assertNotNull(email);
	}
	
	@After
	public void end()
	{
		cust = null;
	}
	
	@AfterClass
	public static void finale()
	{
		System.out.println("Test Check Completed");
	}
}
