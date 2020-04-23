package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args)
	
	
	{
		//FirefoxDriver driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://Amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Govind");
			
				
	}

}
