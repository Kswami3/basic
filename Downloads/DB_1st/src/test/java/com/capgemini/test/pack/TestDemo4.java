package com.capgemini.test.pack;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import dao.EmployeeServiceImpl;
import model.Employee;
import service.EmployeeService;

public class TestDemo4 {
	
	EmployeeService service;
	@Before
	public void setUp()
	{
		service = new EmployeeServiceImpl();
	}
	
	@Test
	public void testMethod1()
	{
		Employee emp = service.getEmpById(1);
		assertNotNull("emp should not be null",emp);
		
	}

}
