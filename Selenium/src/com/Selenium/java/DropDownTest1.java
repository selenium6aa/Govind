package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTest1 {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");		
		driver.manage().window().maximize(); 
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++)
		
		{
			//System.out.println(dropList.get(i).getText());
			
			//dropList.get(i).click();
			
			if(dropList.get(i).getText().equals("Baby"))
			{
				dropList.get(i).click();
			}
		}
	}

}
