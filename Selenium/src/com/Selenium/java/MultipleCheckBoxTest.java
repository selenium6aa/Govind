package com.Selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");		
		driver.manage().window().maximize(); 
		
WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

List<WebElement> CheckList=table.findElements(By.tagName("input"));

System.out.println(CheckList.size());

for (int i = 0; i < CheckList.size(); i++)

{
	//click on one by one checkbox
	
	//CheckList.get(i).click();
	
	//click on specific checkbox "Cheese"
	
	/*if(CheckList.get(i).getAttribute("value").equals("Cheese"))
		
	{
		CheckList.get(i).click();
		
	}*/
	
	//capture the status & name
	
	//System.out.println(CheckList.get(i).getAttribute("Checked")+"----"+CheckList.get(i).getAttribute("value"));
	
	//validation
	
	CheckList.get(i).click();
	System.out.println("click on:  "+CheckList.get(i).getAttribute("value"));

	for (int j = 0; j < CheckList.size(); j++)
	
	{
		System.out.println(CheckList.get(j).getAttribute("Checked")+"----"+CheckList.get(i).getAttribute("value"));
	}
	System.out.println("#########");
}



		
	}

}
