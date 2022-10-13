package com.capgemini.test.pack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import controller.MyClass;

@RunWith(Parameterized.class)
public class TestDemo3 {
	
	String input;
	String output;
	public TestDemo3(String input, String output)
	{
		this.input = input;
		this.output = output;
	}
	
	@Parameters
	public static Collection testAllCondition()
	{
		Object expectedOutput[][] = {
				{"AACD","CD"},
				{"ACD","BCD"},
				{"AATT","TT"}
		};
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void testCase()
	{
		MyClass m = new MyClass();
		assertEquals(output, m.method1(input));
	}
	
	

}
