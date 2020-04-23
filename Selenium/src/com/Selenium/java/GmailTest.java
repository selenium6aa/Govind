package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest 

{

	public static void main(String[] args)
	
	{
		//FirefoxDriver driver=new FirefoxDriver();
		
		String expTitle="Gmail";
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://google.co.in");		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_g")).click();
		
		//validation
		
			String actTitle=driver.getTitle();
				if(expTitle.equals(actTitle))
				{
					System.out.println("Gmail Link is working");
				}else
					
				{
					System.out.println("Gmail Link is not working");
				}
		//capture the title of the page
		
		//System.out.println(driver.getTitle());
		
	
		
		//capture the url of the page
		
		
		//System.out.println(driver.getCurrentUrl());
		
		//close the app
		
		//driver.close();
		
	}

}
