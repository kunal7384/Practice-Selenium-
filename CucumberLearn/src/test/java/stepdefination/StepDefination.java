/*package stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configreader.ConfigReader;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.FileReaderManager;
import manager.PageObjectManager;
import manager.WebDriverManage;
import pages.LogOut;
import pages.LoginPage;
import pages.SearchStudentPage;

public class StepDefination {
	
	static WebDriver driver;
	
	LoginPage loginpage;
	SearchStudentPage studentpage;
    LogOut logout;
    PageObjectManager pom ;
   // ConfigReader con ;
    FileReaderManager frm ; 
    
    WebDriverManage wm ;
	
	String actual = "Practice Pad";
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//con = new ConfigReader();
		wm = new WebDriverManage();
		
	    driver = wm.getDriver();
	    driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expmsg = driver.getTitle();
	    System.out.println("Title of the Page is "+  expmsg);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	pom = new PageObjectManager(driver);
	    loginpage = pom.getLoginPage();
	 for(Map<String, String> userdara : data.asMaps(String.class, String.class))
	 {
	    loginpage.setUserName(userdara.get("UserNAme"));
	    loginpage.setPassWord(userdara.get("PassWord"));
	    loginpage.clickonSubmmit();
	
	 }
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String expmsg = driver.getTitle();
	if(driver.getTitle().equals(actual))
	{
         Assert.assertTrue(true);
         System.out.println("Login Sucessfully");
		
	}
		
	else
	{
		
		System.out.println("some thing Went Wrong");
		 Assert.assertTrue(false);
			
	}
	   
	}
	@Given("^user login with application$")
	public void user_login_with_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Done");
	}

	@When("^user Enter any name in Search Box$")
	public void user_Enter_any_name_in_Search_Box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pom = new PageObjectManager(driver);
		   studentpage = pom.getSearchStudentPage();
		System.out.println("22");
		   Thread.sleep(5000);
			//con = new ConfigReader();
	   studentpage.setSearchStudent(FileReaderManager.getInstance().getConfigReader().getStudentName());
	   Thread.sleep(7000);
	   studentpage.clickingOnStudent();
	   if(driver.findElement(By.xpath("//*[text()='Bhavesh Narola']")).getText().equals("BHAVESH NAROLA"))
		{
			
			System.out.println("We are Enter In Right Student profile");
			
			System.out.println("============All Teacher Name are below::========");
			studentpage.allTeacher();
			
			System.out.println("============END:========");
			
			Assert.assertTrue(true);
			
		}
		
		
		else
			
		{
			
			System.out.println("We are Enter In Wrong Student Profile");
			
			Assert.assertTrue(false);
			
		}

	
	
	   
	}

	@When("^should display that searched student and click on it$")
	public void should_display_that_searched_student_and_click_on_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Student Dispay ");
	 
	}

	@Then("^should open searched studen page$")
	public void should_open_searched_studen_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Paged Open ");
	}
	
	@When("^User click on LogOut Link$")
	public void user_click_on_LogOut_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pom = new PageObjectManager(driver);
	 logout = pom.getLogOut();
	  logout.clickonLogoutAvatar();
	  
	}

	@Then("^User Shoulg get log out from Application$")
	public void user_Shoulg_get_log_out_from_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		logout.clickonlogOut();
	}

} */
