package com.Selenium.java;

import java.util.Scanner;

public class IFStatement {

	public static void main(String[] args)
	{
		//To chk the given no. is even/odd
		
		
		// reading data from keyboard
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if (n%2==0)
		
		{
			System.out.println("number is even");
			
		}
			
			else
				
			{
				
				System.out.print("number is odd");
			}
		
	}

}
