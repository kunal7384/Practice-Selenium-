package com.kunal;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Abc {
	
	
	public static WebDriver driver;
	@Test
	public void test() throws MalformedURLException
	{
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://localhost:4444/wd/hub");
		 
		// Create driver with hub address and capability
		WebDriver driver=new RemoteWebDriver(url, cap);
		 
		// start application
		driver.get("http://18.217.208.182/");
		 
		// get the title and print the same
		System.out.println("Blog title is "+driver.getTitle());
		 
		driver.close();
		
	}

}
