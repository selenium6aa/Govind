	package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QedgeOrangeHRM {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("https://www.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='ppm-popup-9441']/span")).click();
		driver.findElement(By.xpath("//*[@id='main-menu-item-557']/a/strong")).click();
		driver.findElement(By.xpath("//*[@id='main-menu-item-559']/a")).click();
		driver.findElement(By.xpath("//*[@id='post-83']/div")).click();
		driver.findElement(By.xpath("//*[@id='post-83']/div/div[3]/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		driver.close();
		
		
		
		
	}

}
