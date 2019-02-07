package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pages.SettingPage;

public class SettingTest {
	
	TestContext tc;
	SettingPage setting ; 
	
	
	
	
	public SettingTest(TestContext context)
	{
		
		tc = context;
		setting = tc.getpageObjectManager().getsetting();
		
		
		
	}
	
	
	
	@When("^user click on setting and display Setting of that account$")
	public void user_click_on_setting_and_display_Setting_of_that_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   setting.validate_setting();
	}

}
