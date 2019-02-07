package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver;
	
	
	@Test(priority=1)
  public void open() {
		
		
	  System.out.println("Open hvhfg");
	  
		Utility.getdriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Utility.getdriver().manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		Utility.getdriver().get("http://practice-pad.com/");
  }
  
	@Test(priority=2)
  public void Login() {
 
		
		
		
	Utility.getdriver().findElement(By.id("username_or_email")).sendKeys("bhavesh");  
	Utility.getdriver().findElement(By.id("login_password")).sendKeys("password"); 
	Utility.getdriver().findElement(By.name("commit")).click(); 

  }
  
  
  
}
