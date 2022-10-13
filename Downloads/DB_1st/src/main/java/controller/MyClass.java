package controller;

public class MyClass {
	
	
	public String method1(String str)
	{
		//AACD--CD
		if(str.length() <= 2)
		{
			return str.replaceAll("A", "");
			
		}
		String s1 =str.substring(0, 2);
		String s2 = str.substring(2);
		return s1.replaceAll("A", "")+s2;
		
	}
	
	public boolean method2(String str)
	{
		//AACD--false
		if(str.length()<=1)
		{
			return false;
		}
		if(str.length()==2)
		{
			return true;
		}
		String s1 = str.substring(0, 2);
		String s2 = str.substring(str.length()-2);
		return s1.equals(s2);
	}

}
