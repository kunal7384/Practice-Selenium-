package manager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.CreateStudentPage;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.SearchStudentPage;
import pages.SettingPage;
import pages.StatPage;
import pages.UploadVideoPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	HomePage home;
	LoginPage login;
	SearchStudentPage student ;
	UploadVideoPage upload;
	StatPage stat;
	SettingPage setting;
	CreateStudentPage create;
	LogOutPage logout;
	
	public PageObjectManager(WebDriver driver)
	{
		
	this.driver = driver;	
		
	}
	
	public HomePage gethomepage() throws IOException
	{
		return(home==null) ? home = new HomePage(driver) :home;
		
	}
	
	public LoginPage getloginpage()
	{
		return (login==null ) ? login = new LoginPage(driver) : login;
		
		
		
	}
	
	public SearchStudentPage getsearchstudent()
	{
		return (student==null) ? student = new SearchStudentPage(driver) : student;
		
		
		
	}
	
	
	public UploadVideoPage getuploadpage()
	{
		return (upload==null ) ? upload = new UploadVideoPage(driver) : upload;
		
		
		
		
	}
	
	public StatPage getstatpage()
	{
		return (stat==null ) ? stat = new StatPage(driver): stat;
		
		
		
	}
	
	
	public SettingPage getsetting()
	{
		
		return(setting == null ) ? setting = new SettingPage(driver) : setting;
		
		
		
	}
	
 public CreateStudentPage getcreateStudentPage()
 {
	 
	 return(create==null)  ? create = new CreateStudentPage(driver) : create;
	 
 }
 
 
 public LogOutPage getlogOutpage()
 {
	 
return(logout==null) ? logout = new LogOutPage(driver) : logout;	  
	 
 }
	 

}
