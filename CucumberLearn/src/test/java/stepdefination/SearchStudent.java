package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.FileReaderManager;
import manager.PageObjectManager;
import pages.SearchStudentPage;

public class SearchStudent {
	
	WebDriver driver;
	SearchStudentPage studentpage;
	
	TestContext textcontext;
	
	
	public SearchStudent(TestContext context)
	{
		
		
		textcontext=context  	;
		
		studentpage = textcontext.getPageObjectManager().getSearchStudentPage();
	}
	
	@Given("^user login with application$")
	public void user_login_with_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Done");
	}

	@When("^user Enter any name in Search Box$")
	public void user_Enter_any_name_in_Search_Box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
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

}
