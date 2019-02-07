package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchStudentPage {
	
	public static WebDriver driver;
	
	@FindBy(id="search_user")
	WebElement search_stu;
	
	
	@FindBy(xpath="//*[text()='Select Student']")
	WebElement select_stu;
	
	public SearchStudentPage(WebDriver driver)
	{
	this.driver= driver;	
	PageFactory.initElements(driver, this);
	
	}
	
	public void search_student() throws InterruptedException
	{
	search_stu.sendKeys("Kunal Dhote");	
	Thread.sleep(2000);
		select_stu.click();
		String url1 = driver.getCurrentUrl();
		System.out.println("=========="+url1+"============");
		if(url1.contains("http://practice-pad.com/lessons/user/1563/instrument/1"))
		{
			System.out.println("===============Test Case3 pass==============");

		}
		else
		{
			
			System.out.println("===============Test Case3 Failed==============");
		}
		
	}

}
