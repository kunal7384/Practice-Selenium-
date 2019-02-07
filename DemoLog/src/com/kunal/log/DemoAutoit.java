package com.kunal.log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoit {
 public static WebDriver driver;
 
 public static void main(String[] args) throws IOException {
	
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   
	    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	   
	    driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
	driver.get("https://www.engprod-charter.net");
	System.out.println("ffd");

	Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\AutoIt\\record.exe");
	
	System.out.println("ff");
}
	
	
}
