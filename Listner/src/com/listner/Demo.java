package com.listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.listner.DemoListner.class)
public class Demo {
	WebDriver driver;
	@Test(priority= 1)
	
	public void run()
	{
		
		driver = new  ChromeDriver();
		driver.get("http://18.218.123.45/");
	driver.findElement(By.xpath("//*[@id='username_or_email']")).sendKeys("sagar1");
	driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("password");
	driver.findElement(By.xpath("//*[@name='commit']")).click();
		
	
	}
	
	@Test(priority=2)
	public void TetstoFail()
	{
		 System.out.println("This method to test fail");					
		    Assert.assertTrue(false);	
		
		
	}
	

}
