package stepdefination;

import org.openqa.selenium.WebDriver;


import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.PageObjectManager;
import pages.LogOut;
import pages.SearchStudentPage;

public class LogOutTest {
	
	WebDriver driver;
	  LogOut logout;
	
	TestContext textcontext;

	
	public  LogOutTest(TestContext context)
	{
		
		
		textcontext=context  ;
		
		logout = textcontext.getPageObjectManager().getLogOut();
	
		
		
	}
	
	
	@When("^User click on LogOut Link$")
	public void user_click_on_LogOut_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  logout.clickonLogoutAvatar();
	  
	}

	@Then("^User Shoulg get log out from Application$")
	public void user_Shoulg_get_log_out_from_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		logout.clickonlogOut();
	}
}
