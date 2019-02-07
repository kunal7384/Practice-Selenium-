package com.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	
	WebDriver driver;
	
	@Test
	
	public void handle_Table()
	
	{
		 driver = new ChromeDriver();
		driver.get("file:///C:/Users/dkunal/Desktop/test.html");
		
	
		// Print The Total Heading Method I
	/*	List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']//th"));
		
	int x= 	ele.size();
	System.out.println(x);
	 for(int i =0 ;i<ele.size();i++)
	 {
		 
		String element = ele.get(i).getText();
		System.out.println(element);*/
		
		
		// Print The Total Heading Method I
		
		
		
	/*	List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']//th"));
		for(WebElement element :ele)
		{
		String s =	element.getText();
		System.out.println(s);*/
		
		
		
		// Print Total No of row 
		
		
  /* List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']//tbody//tr"));
int x= ele.size()-1;
System.out.println(x);
 for(int i =0;i<ele.size();i++)
 {
	 String s =ele.get(i).getText();
	 System.out.println(s);
	 
 }*/
		
		
		// BOok Return bY Mukesh
		
		/* List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']//tbody//tr"));	
		   for(int i =2;i<ele.size();i++)
		   {
			 WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]"));
			 if(element.getText().toLowerCase().equalsIgnoreCase("Mukesh"))
			 {
				 WebElement bookNameColumns=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
					System.out.println(bookNameColumns.getText());
				 
				 
			 }*/
		
		// print the last column 
		
		
		/*List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr[\"+i+\"]/td[3]"));
			   int x = ele.size();
			   System.out.println(x);
                for(WebElement element : ele)
                {
                	
                System.out.println(element.getText());	
                	
                
                }*/
		// BOok Return bY Mukesh
		
		List<WebElement> ele  = driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr/td[text()='Mukesh']/../td[1]"));
	  for(WebElement element :ele)
	  {
		System.out.println(element.getText());  
		  
	  }
	 
		
			
			
	}
		}
	 		
		
	


