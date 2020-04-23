package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinkTest {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");		
		driver.manage().window().maximize(); 
		
		// identify the header section by using id and store into webelement
		
		WebElement header=driver.findElement(By.id("nav-xshop"));
		
		// identify the all links under this header section by using tagName & store into webelement
		
	List<WebElement> headerLinks = header.findElements(By.tagName("a"));
	
	System.out.println(headerLinks.size());
	
	for (int i = 0; i < headerLinks.size(); i++) 
	
	{
		System.out.println(headerLinks.get(i).getText());
		
	}
	
	}

}
