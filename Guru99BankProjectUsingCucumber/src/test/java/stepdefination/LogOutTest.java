package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogOutPage;

public class LogOutTest {
	
	TestContext tc ; 
	LogOutPage logout;
	
	   
	
	public LogOutTest(TestContext context)
	{
		tc = context;
		
		 logout = tc.getpageObjectManager().getlogOutpage();
		
	}
	
	@When("^User click on LogOut Link$")
	public void user_click_on_LogOut_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   logout.getlogout();
	}

	@Then("^User Should Logout from the Application and Display Logout message$")
	public void user_Should_Logout_from_the_Application_and_Display_Logout_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("LogOut From Application Scucessfully");
	}

	

}
