package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath=" //a[@class='dropdown-toggle']//span[@class='caret']")
	WebElement clk_logout;
	@FindBy(xpath="//*[text()='Log Out']")
	WebElement click_logout;
	
	
	public LogOutPage(WebDriver driver)
	{
		
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void getlogout() throws InterruptedException
	{
		 Thread.sleep(2000);
		clk_logout.click();
		click_logout.click();
		
	}
	
	
	

}
