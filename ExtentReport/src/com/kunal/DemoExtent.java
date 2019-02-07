package com.kunal;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoExtent {

	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	 
	 
	@Test
	public void verifyBlogTitle()
	{
	report=new ExtentReports("C:\\Users\\dkunal\\Desktop\\Report\\abc.html");
	 
	logger=report.startTest("VerifyBlogTitle");
	 
	driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	logger.log(LogStatus.INFO, "Browser started ");
	 
	driver.get("http://www.learn-automation.com");
	 
	logger.log(LogStatus.INFO, "Application is up and running");
	 
	String title=driver.getTitle(); 
	System.out.println(title);
	
	 
	Assert.assertTrue(title.contains("Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step")); 
	 
	logger.log(LogStatus.PASS, "Title verified");
	report.endTest(logger);
	report.flush();
	 
	driver.get("C:\\Users\\dkunal\\Desktop\\Report\\abc.html");
	}
	
}
