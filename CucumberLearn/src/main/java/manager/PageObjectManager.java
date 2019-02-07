package manager;

import org.openqa.selenium.WebDriver;

import pages.LogOut;
import pages.LoginPage;
import pages.SearchStudentPage;

public class PageObjectManager {
	WebDriver driver;
	LoginPage loginpage;
	SearchStudentPage studentpage;
    LogOut logout;
	
	
	
	
	
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver  = driver;
		
		
	}
	
	
	public LoginPage getLoginPage()
	{
		
	return (loginpage==null) ? loginpage = new LoginPage(driver)	:loginpage;
		
	}
	
	public SearchStudentPage getSearchStudentPage()
	{
		return (studentpage==null)? studentpage=new SearchStudentPage(driver) :studentpage;
		
		
		
	}

	
	public  LogOut getLogOut()
	{
		return (logout==null)? logout = new LogOut(driver): logout;
		
		
		
	}
}
