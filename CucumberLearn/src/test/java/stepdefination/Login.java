package stepdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.FileReaderManager;
import manager.PageObjectManager;
import manager.WebDriverManage;
import pages.LoginPage;

public class Login {
	
	TestContext textcontext;
	LoginPage loginpage;
	WebDriverManage wm ;
	
	
	
	
	public Login(TestContext context)
	{
	
		textcontext =context  	;
	
	loginpage = textcontext.getPageObjectManager().getLoginPage();
	}
	

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//con = new ConfigReader();
		System.out.println("Start");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User NAvigaete ro home page");
		loginpage.navigate_url();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	
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
		
		System.out.println("Done");
	   
	}
	
	
	

}
