package com.Selenium.java;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class ArrayListTest {

	public static void main(String[] args) 
	
	{
		//ArrayList<String> l=new ArrayList<>();
	/*	
		List<String> l=new ArrayList<>();
		
		l.add("Govind");
		l.add("123");
		l.add("tgt");
		l.add("4");
		l.add("Snehal");
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++)
		{
			
		System.out.println(l.get(i));
		}
		
		
	for (String item : l)
	{
		System.out.println(item);
	}
		
			
	}*/
		
		List<Object> l=new ArrayList<>();
		
		l.add("Govind");
		l.add(2);
		l.add(4);
		l.add("Govind");
		
		/* System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++)
		{
			
		System.out.println(l.get(i));
		}
		*/
		
		
	for (Object item : l)
	{
		System.out.println(item);
	}
		
			
	}	

}
