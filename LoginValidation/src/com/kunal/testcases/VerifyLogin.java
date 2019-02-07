package com.kunal.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kunal.pages.LoginPage;

public class VerifyLogin {
	
public  WebDriver driver;
	@Test
	public void Logintest()
	{
		String actual = "http://18.218.190.110/admin/dashboard/dashboard_page";
		driver =new ChromeDriver();
		driver.get("http://18.218.190.110/admins/sign_in");
		LoginPage p = new LoginPage(driver);
		p.set_Login("shm@narola.email", "password");
		String exc = driver.getCurrentUrl();
		Assert.assertEquals(actual,exc );
				
		
	}
	
	@Test
	public void Logintest_invalid()
	{
	
		driver =new ChromeDriver();
		driver.get("http://18.218.190.110/admins/sign_in");
		LoginPage p = new LoginPage(driver);
	p.set_Login("shm@narola.email", "passWord");
		 Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Invalid username or password.']")).getText(),"Invalid username or password.");
				
		
	}

}
