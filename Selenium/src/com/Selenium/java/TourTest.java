package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TourTest {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		
		
	}

}
