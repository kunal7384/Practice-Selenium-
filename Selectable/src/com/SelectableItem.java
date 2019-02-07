package com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectableItem {
	
	WebDriver driver;
	

	 
    

/*@Test
public void selectItems() throws InterruptedException {  

	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");

    //Prepare list of selectable Items
    List<WebElement> selectableItems = driver.findElements(By.xpath("//ol[@id='selectable']/*"));           

    //Build the select Item action.
    Actions toSelect = new Actions(driver);
    toSelect.clickAndHold(selectableItems.get(2)).clickAndHold(selectableItems.get(5)).click();

    //Perform action.
    Action selectItems = toSelect.build();
    selectItems.perform();
	
	
	
	
	
	
	
	
}}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void run()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		 List<WebElement> selectItems = driver.findElements(By.xpath("//ol[@id='selectable']/*")); 
		int x= selectItems.size();
		System.out.println(x);
		Actions action = new Actions(driver);
		  action.clickAndHold(selectItems.get(2)).clickAndHold(selectItems.get(5)).click();

		
	action.build().perform();
		
		
	}
	
	
}


