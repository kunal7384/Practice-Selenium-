package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	public static WebDriver driver;
	
	public static WebElement elementIsPresent(WebDriver driver , String xpath,int time)
	{
		WebElement ele = null;
	try {
		for(int i=0;i<time;i++){
			
	 ele =	driver.findElement(By.xpath(xpath));
		break;	
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	try {
		
		Thread.sleep(1000);
	}	
	catch (Exception e) {
		// TODO: handle exception
	}
	return ele;	
	}	
		

		
	}
	

