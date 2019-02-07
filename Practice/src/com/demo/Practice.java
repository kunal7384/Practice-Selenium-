package com.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	
	// First we find total Link Present and perform click operarion on it
	
	
	WebDriver driver;
	
	//@Test
	
//	public void run()
//	{
	/*	driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	 List<WebElement>link = driver.findElements(By.tagName("a"));
	 int totallink = link.size();
	 System.out.println(totallink);
	 String[] links = new String[totallink];
	 for(int i=0;i<link.size();i++)
	 {
	/*	WebElement ele = link.get(i);
		
		String url = ele.getAttribute("href");
		System.out.println(url);*/ 
		 
	/*	 links[i]=link.get(i).getAttribute("href");
		}
		 for(int i=0;i<link.size();i++)
		 {
			driver.navigate().to(links[i]); 
			 
		 }
		 
	 }*/
		
		// Synchronization In Selenium 
		
		
	/*	public static WebElement elementisPresent(WebDriver driver,String xPath ,int time)
		{
		WebElement ele = null;
		try
		{
		for(int i =0;i<time;i++)
		{
		ele= driver.findElement(By.xpath(xPath));
		 break;
		} 
		}catch (Exception e) {
			// TODO: handle exception
		}	
		
		try
		{
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			return ele;
		}*/
	
	// Stoared cookies.......
	  
	@Test
	
	public void run() throws IOException
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		File file = new File("cookies.data");
		file.delete();
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		for(org.openqa.selenium.Cookie ck : driver.manage().getCookies()) {
			
			 bw.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
			   
		       bw.newLine();
			
		}
		
		bw.close();
		fw.close();
	}
	

	
	
	}


