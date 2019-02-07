package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

import manager.FileReaderManager;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(id="username_or_email")
	public static WebElement username;
	
	@FindBy(id="login_password")
	public static WebElement password;
	
	
	@FindBy(name="commit")
	public static WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
	}
	
	
	public void enter_Username() throws IOException
	{
		
		System.out.println("11");
		username.sendKeys(FileReaderManager.getInstance().getconfig().getusername());
		
	}
	
	public void enter_Password() throws IOException
	{
		password.sendKeys(FileReaderManager.getInstance().getconfig().getpassword());
		
	}
	
	public void valid_Login() throws IOException
	{
		enter_Username();
		enter_Password();
		login.click();
	}
	
	public void  validate_url()
	{
		 String url = driver.getCurrentUrl();
			System.out.println("============="+url+"=============");
			
			if(url.contains("http://practice-pad.com/users/1562"))
			{
				System.out.println("===============Test Case2 pass==============");
				
			}
			else
			{
				System.out.println("===============Test Case2 failed==============");
				
			}
		
		
	}

}
