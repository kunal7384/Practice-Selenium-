package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginTest {
	
	TestContext tc;
	LoginPage login;
	
	
	
	public LoginTest(TestContext context)
	{
		
		tc = context;
		login = tc.getpageObjectManager().getloginpage();
		
		
	}
	
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	  login.valid_Login();
	  login.validate_url();
	
	}
}
