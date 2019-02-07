package test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log {
	public static WebDriver driver;
	Logger log = Logger.getLogger("Log");
	
  @Test(priority=1)
  public void browser_start() {
	  PropertyConfigurator.configure("log4j.properties");
	  driver = new ChromeDriver();
	  log.info("Log Started");
	  Reporter.log("Browser Starting");
	  driver.get("http://18.217.208.182/");
	  log.info("Log open URl");
	  Reporter.log("Browser Started");
  }
  @Test(priority=2)
  public void lopgin() {
	  
	driver.findElement(By.xpath("//*[@href='/sign-in']")) .click();
	 Reporter.log("Login pop up open to fill the detail of user");
	 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("mis@narola.email");
	 Reporter.log("UserName Entered");
	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
	 Reporter.log("password Entered");
	 driver.findElement(By.xpath("//*[@class='c-login-btn-container']")).click();
	  log.info("Login s");
	 
	 
	 
	
	 
}
}