package com.kunal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	
	public static WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	
	@Test(priority=1)
	public void test()
	{
	report=new ExtentReports("C:\\Users\\dkunal\\Desktop\\Report\\Aaa.html");
	logger=report.startTest("Verify Google Tole");
     driver=new ChromeDriver();
     logger.log(LogStatus.INFO,"Browser Started");
     driver.get("https://www.google.com/");
     logger.log(LogStatus.INFO, "Url Opening");
     String title=driver.getTitle();
     Assert.assertTrue(title.contains("Google"));
     report.endTest(logger);
     report.flush();
     driver.get("C:\\Users\\dkunal\\Desktop\\Report\\Aaa.html");
		
		
}
	
	@Test(priority=2)
	
	public void demo()
	{
		logger=report.startTest("Verify");
		System.out.println("Sucess");
		report.endTest(logger);
	     report.flush();
	     driver.get("C:\\Users\\dkunal\\Desktop\\Report\\Aaa.html");
			
	}

}
