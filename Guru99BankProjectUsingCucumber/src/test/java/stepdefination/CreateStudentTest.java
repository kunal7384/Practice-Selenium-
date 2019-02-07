package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateStudentPage;

public class CreateStudentTest {
	
	TestContext tc;
	CreateStudentPage create;
	
	
	
	public CreateStudentTest(TestContext context)
	{
	tc= context;	
	create=	tc.getpageObjectManager().getcreateStudentPage();
		
	}
	
	
	@When("^user click on create Student link without filling any data$")
	public void user_click_on_create_Student_link_without_filling_any_data() throws Throwable {
	   create.validateStudent();
	   
	}

	@Then("^Should give error message$")
	public void should_give_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Done");
	}


}
