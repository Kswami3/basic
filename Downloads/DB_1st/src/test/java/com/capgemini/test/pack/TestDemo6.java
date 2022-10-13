package com.capgemini.test.pack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestDemo6 {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestDemo4.class);
		
		if(result.getFailureCount()==0)
		{
			System.out.println("All Test Cases Passed");
		}
		else
		{
			for(Failure fail : result.getFailures())
			{
				System.out.println(fail.getMessage());
			}
		}
		System.out.println("result"+" "+result.wasSuccessful());
		
		
	}

}
