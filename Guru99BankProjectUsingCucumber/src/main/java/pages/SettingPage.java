package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SettingPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//h1[contains(text(),'Welcome, Bhavesh Narola')]")
	WebElement txtmsg;
	
	@FindBy(xpath="//span[@class='user-avtar']//img")
	WebElement avtar;
	
	@FindBy(xpath="//a[contains(text(),'Settings')]")
	WebElement setting;
	
	@FindBy(xpath="//*[text()='Cancel']")
	WebElement cancle;
	
	
	
	public SettingPage(WebDriver driver)
	{
	this.driver = driver;	
	PageFactory.initElements(driver, this);
		
		
	}
	
	public void validate_setting() throws FindFailed
	{
		
	     avtar.click();
		setting.click();
		
		String msg = txtmsg.getText();
		
		System.out.println("Text message of User Bhavesh is "+"======="+msg+"==========");
		 cancle.click();
		
		
		
	}


}
