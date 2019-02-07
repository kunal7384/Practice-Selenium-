package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ConfigReader;
import manager.FileReaderManager;

public class LoginPage {
	
	 public static WebDriver driver;
	
	 String actual = "Practice Pad";
	  @FindBy(id="username_or_email")
	
	   WebElement txt_userName;
	
	
      @FindBy(id="login_password")
	
	 WebElement txt_passWord ;
	 
	 
	 
	 @FindBy(name="commit")
		
	 WebElement btn_login;
	 
	 
	
	 
	
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		ConfigReader con  = new ConfigReader();
		
	}

	 public void setUserName(String uid)
	 
	 {
		 
		txt_userName.sendKeys(uid); 
		 
		 
	 }
	
	 
	 public void setPassWord(String userPass)
	 {
		txt_passWord.sendKeys(userPass); 
		 
		 
	 }
	 
	 
	 public void clickonSubmmit()
	 {
		btn_login.click();	
		String expmsg = driver.getTitle();
		if(driver.getTitle().equals(actual))
		{
	         Assert.assertTrue(true);
	         System.out.println("Login Sucessfully");
			
		}
			
		else
		{
			
			System.out.println("some thing Went Wrong");
			 Assert.assertTrue(false);
				
		}
		 
	 }
	 
	
		public void navigate_url() throws InterruptedException
		{
			
			
			    System.out.println("start");
			  //  driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
			    driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	            System.out.println("Testing ");
	           
	        //  driver.get("https://www.google.com/");

			
		}
		
		
	

}
