package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Great {
	WebDriver driver;
	@Test(priority=3,groups= {"smoke"})
	@Parameters("browser")
	public void run_test(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\software\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	
		}
		else {
			driver = new ChromeDriver();
			
		}
		driver.get("http://18.218.123.45/");	
	}

}
