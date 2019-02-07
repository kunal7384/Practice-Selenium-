package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(com.test.Listner.class)
public class LoginTest {
	public WebDriver driver;
	@Test(priority=1, groups= {"smoke"})
	@Parameters("browser1")
	
	public void login_Test(String browser1)
	{
		if(browser1.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
			
		}
		else
		{
			driver =new FirefoxDriver();
			
		}
		
		     String actTitle="GreatPlaceork";
		
			driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		
		driver.get("http://18.218.190.110/admins/sign_in");
		
		driver.findElement(By.id("user_email")).sendKeys("shm@narola.email");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("commit")).click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), actTitle);
		System.out.println("Hi");
		driver.get("http://www.google.co.in");
		
		
		
}      
	@Test(priority=2,groups= {"sanity"})
	public void login()
	{
		 String actTitle="Paygees";
		driver.get("https://beta.paygees.com");
		driver.findElement(By.xpath("//*[@title='Sign In']")).click();
		driver.findElement(By.id("user_email")).sendKeys("kd@narola.email");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.xpath("//*[text()='Log in']")).click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), actTitle);
	
		
		
	}
}