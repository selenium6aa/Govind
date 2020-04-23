package com.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest {

	public static void main(String[] args) 
	
	
	{
		
		String username="Admin";
		String password="Admin";
		String expTitle="Primus BANK";
		
		//Launch App
		//FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
					
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("http://PrimusBank.qedgetech.com");
		
		driver.manage().window().maximize();
		String actTitle=driver.getTitle();
		//vallidation
		if(expTitle.equals(actTitle))
		{
			System.out.println("Applaunch successfully");
		}else
		{
			System.out.println("Applaunch failed");
		}
		
		//App login
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validation
		
		if(driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			
			System.out.println("App login successfully");
		}
		else
		{
			System.out.println("App login failed");
			
		}
		
		//App Logout
		
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();		
		
		// validation
		
		if(driver.findElement(By.name("txtuId")).isDisplayed())
			
		{
			System.out.println("App logot successfully");
		}else
		{
			System.out.println("App logout failed");
		}
		//App close
		
		driver.close();
		
		
	}

}
