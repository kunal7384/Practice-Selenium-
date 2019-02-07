package com.kunal.log;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logTest {
	
	public static WebDriver driver;
	@Test
	 public void test() throws IOException, InterruptedException {
		   Logger log = Logger.getLogger("LogTest");
		   PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
		log.info("Instatiate Browser");
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    log.info("Apply Implicit Wait");
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    log.info("Apply page Load");
    driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
    
    driver.get("https://practice-pad.com/");
	log.info("Enter Web Address");
	System.out.println("Hi");
	log.info("Printing Some Message On Console");
	driver.findElement(By.xpath("//*[@name='username_or_email']")).sendKeys("bhavesh");
	log.info("Enter valid User Name ");
	driver.findElement(By.xpath("//*[@name='login_password']")).sendKeys("password");
	log.info("Enter valid password Here ");
	driver.findElement(By.xpath("//*[@name='commit']")).click();
	log.info("Login Successfully Here ");
	driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("nikhil");
	
	log.info("Searching For Student");
	driver.findElement(By.xpath("//*[@href='/lessons/user/1597/instrument/1']")).click();
	
	log.info("See profile of given Student");
	driver.findElement(By.xpath("//*[@name='note[image][]']")).click();
	Thread.sleep(2500);
	Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\AutoIt\\multiplefile.exe");
//	Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\AutoIt\\multiplefile.exe" + " "+"C:\\Users\\dkunal\\Desktop\\download.jpg");
//	Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\AutoIt\\multiplefile.exe" + " "+"C:\\Users\\dkunal\\Desktop\\b.jpg");
	System.out.println("G");
	

	
	 }  
 
		

}
