package com.Selenium.java;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowerTest 

{

	public static void main(String[] args)
	
	{
		// Launching Firefox browser and navigate to facebook
		
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");

	}

}
