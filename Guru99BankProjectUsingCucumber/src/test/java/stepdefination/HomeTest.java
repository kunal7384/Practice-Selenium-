package stepdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import manager.PageObjectManager;
import manager.WebDriverManager;
import pages.HomePage;

public class HomeTest {
	
	public static TestContext tc;
	public static HomePage home;
	
	
	
	public HomeTest(TestContext context) throws IOException
	{
		
	tc = context;
	home = tc.getpageObjectManager().gethomepage();		
	}
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TTTTT");
		    home.openUrl();
		    home.validate_errormsg();
	
	}

}
