package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import configreader.ReadConfigFile;
import manager.FileReaderManager;

public class HomePage {
	
	public static WebDriver driver;
	
	ReadConfigFile cf;
	
	public HomePage(WebDriver driver) throws IOException
	{
	this.driver = driver;	
	PageFactory.initElements(driver, this);	
      cf = new ReadConfigFile();
		
	}
	public void openUrl() throws IOException
	{
	System.out.println("Start Testing");
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	       driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	    
		 driver.get(FileReaderManager.getInstance().getconfig().geturl());	
	}
	
	
	public void validate_errormsg()
	{
		
		 driver.findElement(By.name("commit")).click();
		 WebElement error =  driver.findElement(By.xpath(" //div[@class='alert alert-danger text-center']"));
	       String errormsg = error.getText();
	       System.out.println("Error Message is :::=========="+errormsg+"=================");
			
			if(errormsg.contains("Invalid username/password combination"))
			{
				System.out.println("==============Test Case1 passed ===================== ");
				
			}
			else 
			{
				
				System.out.println("==============Test Case1 Failed ==================== ");
				
			}
		
		
		
		
	}

}
