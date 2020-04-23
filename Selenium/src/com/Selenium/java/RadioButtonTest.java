package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize(); 
		
		WebElement Radio=driver.findElement(By.id("u_0_6"));
		
		List<WebElement> RadioList=driver.findElement(By.tagName("u_0_z"));
		

	}

}
