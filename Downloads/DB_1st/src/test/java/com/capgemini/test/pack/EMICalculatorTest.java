package com.capgemini.test.pack;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import model.EMICalculator;

public class EMICalculatorTest {
	
	EMICalculator emi;
	@Before
	public void start()
	{
		emi = new EMICalculator();
	}
	
	@Test
	public void TestcalculateEMI_con1()
	{
		double actual = emi.calculateEMI(1000, "Housing Loan", 5);
		double expected = 0.0;
		assertEquals(expected, actual, 0);
	}
	
	
	@Test
	public void TestcalculateEMI_con2()
	{
		double actual = emi.calculateEMI(50000, "Housing Loan", 5);
		double expected = 835.8774991791954;
		assertEquals(expected, actual, 1e-13);
	}
	
	@Test
	public void TestcalculateEMI_con3()
	{
		double actual = emi.calculateEMI(50000, "Vehicle Loan", 5);
		double expected = 835.6652944586566;
		assertEquals(expected, actual, 1e-13);
	}
	
	
	@Test
	public void TestcalculateEMI_con4()
	{
		double actual = emi.calculateEMI(50000, "Personal Loan", 5);
		double expected = 835.4531244436789;
		assertEquals(expected, actual, 1e-13);
	}
	
	@After
	public void end()
	{
		emi = null;
	}
	
	@AfterClass
	public static void finallyy()
	{
		System.out.println("All test cases checked");
	}
	

}
