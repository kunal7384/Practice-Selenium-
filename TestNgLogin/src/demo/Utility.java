package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Utility {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver()
	{
		return driver;
		
		
		
	}
	
	
	@BeforeSuite
   
	public void openBrowser()
	{
		driver = new ChromeDriver();
		
	  
		
		
	}
	
	@AfterSuite
	
	public void close_url()
	{
		System.out.println("==========Trying to LogOut==========");
		
		List<WebElement> link =driver.findElements(By.tagName("a"));
		int linkc = link.size();
		System.out.println(link.size());
		String links[] = new String[linkc];
		for(int i=0;i<=link.size();i++)
		{
			String ele = link.get(i).getAttribute("href");
			links[i] =  link.get(i).getAttribute("href");
			System.out.println(ele);
		}	
			for(int i=0;i<=linkc;i++)
			{
				
				driver.navigate().to(links[i]);
				
			}
			   driver.close();
		}
		//System.out.println("GetText Of Tag " +aa);
      
		
		
	
    

}
