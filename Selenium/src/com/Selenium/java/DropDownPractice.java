package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPractice {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize(); 
		
				
		WebElement country=driver.findElement(By.name("birthday_month"));
		
		List<WebElement> countryList= country.findElements(By.tagName("option"));
		
		System.out.println(countryList.size());
		
		for (int i = 0; i < countryList.size(); i++)
		
		{
			countryList.get(i).click();
			
			
		}
			
	}

}
