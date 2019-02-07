package com.demo.log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoLog {
	public WebDriver driver;
	
	@Test
	public void test()
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter("extent.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extent);
	ExtentTest test =	report.createTest("ASSSSSSSS");
test.log(Status.INFO, "Emter");
driver = new ChromeDriver();

driver.get("https://www.google.com/");
test.log(Status.INFO, "Emter1");

report.flush();



		
	       
		
		
		
		
		
		
	}
	
	
		
		 
	 }


