package com.Selenium.java;

import org.apache.commons.el.EqualsOperator;

public class StringValidation

{

	public static void main(String[] args)
	
	{
		/*String data="Selenium";
		String data1="Selenium";
		
		if(data.equals(data1))
		{
			
			System.out.println("Both strings are equal");
			
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}*/
		
		String data="Selenium training";
		String data1="Selenium";
		
		if(data.contains(data1))
		{
			
			System.out.println("Exist");
			
		}
		else
		{
			System.out.println("Not Exist");
		}
		
		
		
		
	}

}
