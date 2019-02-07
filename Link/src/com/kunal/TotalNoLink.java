package com.kunal;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoLink {
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	List<WebElement>link=	driver.findElements(By.tagName("a"));
	
	
	System.out.println(link.size());
	
	for(int i=0;i<=link.size();i++)
	{
		WebElement ele = link.get(i);
	String aa= 	ele.getAttribute("href");
		System.out.println(aa);
	}


	}

}
