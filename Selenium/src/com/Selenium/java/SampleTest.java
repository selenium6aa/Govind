package com.Selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest 

{

	public static void main(String[] args)
	
	{
		
		//FirefoxDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
					
		driver.get("http://www.naukri.com");
		
		driver.manage().window().maximize();
		
		// closes the current activated window
		//driver.close();
		// closes all the windows open by he web driver
		//driver.quit();
		
		//System.out.println(driver.getPageSource());
		
		
		
	}

}
