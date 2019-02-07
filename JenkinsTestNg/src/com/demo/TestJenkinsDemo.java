package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestJenkinsDemo {
	WebDriver driver;
	@Test(priority=1)
	
	public void demoRun()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get("http://18.218.190.110/");
		driver.findElement(By.xpath("//*[@name='user[email]']")).sendKeys("kd@narola.email");
		driver.findElement(By.xpath("//*[@name='user[password]']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@name='commit']")).click();
		
	}
	
	
		@Test(priority=2)
	
	public void ctrateRecord() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Company Portfolio']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id='search']"));
		ele.sendKeys("Wipro");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@src='//s3.us-east-2.amazonaws.com/gptw-qanalytics/companies/company_logos/000/000/493/thumb/7ad09706bd887a2aad113b5c6a1d34b5_400x400.png?1528097440']")).click();
		driver.findElement(By.xpath("//*[@href='#comercial']")).click();
		driver.findElement(By.xpath("//*[text()='Create New record']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='commit']")));
		element.click();

		
	}
	
	
	
	@Test(priority=3)
	public void logout()
	
	{
		driver.findElement(By.xpath("//*[@class='avater']")).click();
		driver.findElement(By.xpath("//*[@data-method='delete']")).click();
		
		
	}

}
