package com.Selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest

{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://yahoo.co.in");
		

	}

}
