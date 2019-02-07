package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	
	
	WebDriver driver;
	
	
	 @FindBy(xpath="//*[@class='user-avtar']//*[@src='/assets/user.png']")
		
	 WebElement btn_logoutAvtar;
	 
	 
	 @FindBy(xpath="//a[@rel='nofollow']")
		
	 WebElement btn_logOut;
	 
	 
	 
	 public LogOut(WebDriver driver)
		{
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
			
		}
	 
	 
	 public void clickonLogoutAvatar()
	 {
		 
		btn_logoutAvtar.click(); 
		 
	 }
	 
	 
	 
	 public void clickonlogOut()
	 {
		 
		 btn_logOut.click();
		 
	 }

}
