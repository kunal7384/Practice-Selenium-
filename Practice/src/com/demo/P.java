package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P {
	
	WebDriver driver;
	@Test
	public void demoMethod()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	Practice.elementisPresent(driver, "//*[@id='lst-ib']", 20).sendKeys("kjkdfj");	
	
		
	}

}
