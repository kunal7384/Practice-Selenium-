package com.kunal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {  
	public static WebDriver driver;
	By username = By.xpath("//*[@type='email']");
	By password= By.xpath("//*[@type='password']");
    By clc =By.xpath("//*[@type='submit']");
    
    
    public LoginPage(WebDriver driver)
    {
    	
    	this.driver=driver;
    }
    
    public void set_UserName(String user)
    {
    	driver.findElement(username).sendKeys(user);
    	
    	
    }
    
    public void set_passwoird(String pass)
    {
    	driver.findElement(password).sendKeys(pass);
    	
    	
    }
    public void clicked()
    {
    	driver.findElement(clc).click();
    	
    	
    }
    
    public void set_Login(String uid , String passWord)
    {
    	
    	driver.findElement(username).sendKeys(uid);
    	driver.findElement(password).sendKeys(passWord);
    	driver.findElement(clc).click();
    }

}
