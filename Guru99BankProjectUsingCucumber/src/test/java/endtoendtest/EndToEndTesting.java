package endtoendtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class EndToEndTesting {	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://practice-pad.com/");
		
		//Without Filling Userid and Password and click on Login button Then should give an Error message 
		
		driver.findElement(By.name("commit")).click();
		
		WebElement error =  driver.findElement(By.xpath(" //div[@class='alert alert-danger text-center']"));
		       String errormsg = error.getText();
		       System.out.println("Error Message is :::=========="+errormsg+"=================");
				
				if(errormsg.contains("Invalid username/password combination"))
				{
					System.out.println("==============TC1 passed ===================== ");
					
				}
				else 
				{
					
					System.out.println("==============TC1 Failed ==================== ");
					
				}
				
		
		// Login Successfully 
		
		WebElement userName = driver.findElement(By.id("username_or_email"));
		userName.clear();
		userName.sendKeys("bhavesh");
		WebElement password = driver.findElement(By.id("login_password"));
		password.clear();
		password.sendKeys("password");
		driver.findElement(By.name("commit")).click();
		
	String url = driver.getCurrentUrl();
	System.out.println("============="+url+"=============");
	
	if(url.contains("http://practice-pad.com/users/1562"))
	{
		System.out.println("===============TC2 pass==============");
		
	}
	else
	{
		System.out.println("===============TC2 failed==============");
		
	}
	
	// Search student kunal Dhote
	
	
	driver.findElement(By.id("search_user")).sendKeys("Kunal Dhote");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Select Student']")).click();
	
	String url1 = driver.getCurrentUrl();
	System.out.println("=========="+url1+"============");
	
	if(url1.contains("http://practice-pad.com/lessons/user/1563/instrument/1"))
	{
		System.out.println("===============TC3 pass==============");

	}
	else
	{
		
		System.out.println("===============TC3 Failed==============");
	}
	
	
	
	Screen s = new Screen();
	Pattern desk_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\desk.PNG");
	Pattern video_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\video.PNG");
	Pattern open_img = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\guru 99 pro\\open.PNG");
	
	// Uploading Video 
	
	driver.findElement(By.xpath("//*[@href='/users/1563/video/instrument/1']")).click();
	
	driver.findElement(By.id("video_video_url")).click();
	s.click(desk_img);
	s.type(video_img,"Aug 31 2018 4_34 PM.webm");
	s.click(open_img);
	
	
	//Check Stats Functionality .
	
	WebElement stat=	driver.findElement(By.xpath("//*[@href='/progresses/user/1563/instrument/1']"));	
	
	stat.click();
Alert alert = driver.switchTo().alert();
alert.accept();
	 driver.findElement(By.xpath("//*[@id='tab1']"));	
	String info = driver.findElement(By.xpath("//*[@id='tab1']")).getText();
	System.out.println("Stats Info of Users Kunal Dhote is "+info);
	
	
	WebElement progress = driver.findElement(By.id("progress-tab"));
	progress.click();
	String progressBar = progress.getText();
	System.out.println("Progress Bar Of Instument Guitar is"+progressBar);
	
	String p = driver.findElement(By.id("tab2")).getText();
	System.out.println(p);
	}
	}


