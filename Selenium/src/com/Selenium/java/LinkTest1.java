package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web/guest/home.do");		
		driver.manage().window().maximize(); 
		
		// capture all the links by using tagNameand store into webElemnt
		
		@SuppressWarnings("unchecked")
		List<WebElement> links=(List<WebElement>) driver.findElement(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (WebElement element : links)
		
		{
			//System.out.println(element.getText());
			
		if (element.getText().equals("New User Register"))
			
		{
			element.click();
		}
			
		
		}
	
	}

}
