/*package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.PageObjectManager;
import manager.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchStudentPage;
import pages.StatPage;
import pages.UploadVideoPage;

public class StepDefination {
	 static WebDriver driver;
   HomePage home;
   LoginPage login ;
   SearchStudentPage student ;
   UploadVideoPage upload;
   StatPage stat;
   PageObjectManager pom;
  WebDriverManager wb;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wb = new WebDriverManager();
		 driver = wb.getDriver();
		 pom = new PageObjectManager(driver);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 home = pom.gethomepage();
		    home.openUrl();
		    home.validate_errormsg();
	
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  login = pom.getloginpage();
	  login.valid_Login();
	  login.validate_url();
	  
	 
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
   student = pom.getsearchstudent();
   student.search_student();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
         upload = pom.getuploadpage();
         Thread.sleep(6000);
		upload.uploadVideo();
		
		stat = pom.getstatpage();
		stat.getstats();
		
	}



}*/
