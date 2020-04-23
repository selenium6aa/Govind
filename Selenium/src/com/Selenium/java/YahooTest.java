package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTest {

	public static void main(String[] args)
	
	{
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
				
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("http://Yahoo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		
		driver.findElement(By.id("uh-search-button")).click();

	}
	
}
