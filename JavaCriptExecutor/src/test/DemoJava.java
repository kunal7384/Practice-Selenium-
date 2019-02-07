package test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.asm.Advice.Argument;

public class DemoJava {
	
	public static WebDriver driver;
	
	@Test
	
	public void test()
	{
		ExtentReports report;
		ExtentTest test;
		report=new ExtentReports("C:\\Users\\dkunal\\Desktop\\Report\\test.html");
		test=report.startTest("Verify All Functiionality");
		test.log(LogStatus.INFO, "Browser");
		
		driver= new ChromeDriver();
		test.log(LogStatus.INFO, "Url");
		driver.get("http://demo.guru99.com/V4/");
		test.log(LogStatus.INFO, "Element");
		 WebElement button =driver.findElement(By.name("btnLogin"));
	/*	 WebElement button =driver.findElement(By.name("btnLogin"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr133330");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jUhEdaq");
		 js.executeScript("arguments[0].click();", button);
		// js.executeAsyncScript("alert('Login sucessfully');" );
		String title= js.executeScript("return document.title;").toString();
		// String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		String url =js.executeScript("return document.URL;").toString();
		System.out.println(url);
		js.executeScript("window.scrollBy(0,1000)");*/
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
	//	WebElement ele = driver.findElement(By.xpath("//*[@name='btnLogin']"));
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr133330");

		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jUhEdaq");
	//	js.executeScript("arguments[0].click();", ele);
	 //js.executeScript("doument.getElementByName('btnLogin').click()");
		
		js.executeScript("arguments[0].click();", button);
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		//js.executeScript("alert('Welcome to BAnk');");
		js.executeAsyncScript("alert('Login sucessfully');" );
		Alert alert =driver.switchTo().alert();
		alert.accept();
	String url=	js.executeScript("return document.URL;").toString();
	System.out.println(url);
	WebElement ele = driver.findElement(By.xpath("//*[@href='Logout.php']"));
	js.executeScript("arguments[0].scrollIntoView();",ele);
	
	report.endTest(test);
	report.flush();
	driver.get("C:\\Users\\dkunal\\Desktop\\Report\\test.html");
			
			
		}
		
	}

	


