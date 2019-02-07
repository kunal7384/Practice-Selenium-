package com.kunal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoExtent {
	public static WebDriver driver;
	ExtentReports report;
	ExtentTest logger; 
	
	@Test(priority=1)
	public void demo()
	{
		report=new ExtentReports("C:\\Users\\dkunal\\Desktop\\Report\\abcd.html",true);
		logger=report.startTest("Verify");
		
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    logger.log(LogStatus.INFO,"Opening the Webpage");
   String title= driver.getTitle();
   System.out.println(title);
   logger.log(LogStatus.INFO, "Captured title");
    Assert.assertTrue(title.contains("Google"));
   logger.log(LogStatus.PASS, "Verify");
   
   
	}
	
	@Test(priority=2)
	public void demo1() throws InterruptedException
	{
		logger=report.startTest("Verify URl");
	logger.log(LogStatus.INFO, "we are going to search the result");
WebElement ele =	driver.findElement(By.xpath("//*[@id='lst-ib']"));
ele.sendKeys("Narola");
ele.sendKeys(Keys.ENTER);
	logger.log(LogStatus.INFO,"we are passing value Narola To search");
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//*[@name='btnK']")).click();
	
	logger.log(LogStatus.INFO, "Performing click Operation");
	String url = driver.getCurrentUrl();
	Assert.assertTrue(url.contains("https://www.google.com/search?"));
	logger.log(LogStatus.PASS, "Verified URl");
		
		
	}
	
	@Test(priority=3)
	public void eyerne() throws InterruptedException
	{
		logger=report.startTest("Test EyeRne Project Title ");	
		driver.get("http://www.eyerne.com");
		logger.log(LogStatus.INFO, "Navigate To Eyerne Project URL");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		logger.log(LogStatus.INFO, "Capture Current Url");
		Assert.assertTrue(url1.contains("www.eyerne.com"));
		logger.log(LogStatus.PASS, "Url Captured Sucessfully");
		String title1 = driver.getTitle();
		System.out.println(title1);
		logger.log(LogStatus.INFO, "Captured Title of the Project");
		Assert.assertTrue(title1.contains("EyErne"));
		logger.log(LogStatus.PASS, "Title Match");
		Thread.sleep(2500);
		
		
		
	}
	
	@Test(priority=4)
	public void login()
	{
		logger=report.startTest("Test Login Functioanality ");	
		driver.findElement(By.xpath("//*[@routerlink='/sign-in']//following::a[2]")).click();
		logger.log(LogStatus.INFO, "Clicked ON sign in Link");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kd@narola.email");
		logger.log(LogStatus.INFO, "Entered User ID");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		logger.log(LogStatus.INFO, "Entered Password ");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		logger.log(LogStatus.INFO, "Clicked on Sign in link");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		logger.log(LogStatus.INFO, "Capture Current Url");
		Assert.assertTrue(url2.contains("http://www.eyerne.com/"));
		logger.log(LogStatus.PASS, "Url Captured Sucessfully");
		String title1 = driver.getTitle();
		System.out.println(title1);
		logger.log(LogStatus.INFO, "Captured Title of the Project");
		Assert.assertTrue(title1.contains("EyErne"));
		logger.log(LogStatus.PASS, "Title Match");
	
	}
	
	@Test(priority=5)
	public void logout()
	
	{
	logger=report.startTest("Verify the logout Functionality");
	driver.findElement(By.xpath("//*[@class='c-user-menu__avatar-image']")).click();
	logger.log(LogStatus.INFO, "Click on Logut Image");
	
	}
	
	@AfterTest
	
	public void report()
	{
   report.endTest(logger);
   report.flush();
   driver.get("C:\\Users\\dkunal\\Desktop\\Report\\abcd.html");
   
		
	}

}
