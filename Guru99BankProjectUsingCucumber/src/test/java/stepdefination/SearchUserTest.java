package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pages.SearchStudentPage;

public class SearchUserTest {
	TestContext tc;
	 SearchStudentPage student ;
	 
	 
	 public SearchUserTest(TestContext context)
	 {
		 
		tc = context; 
		student = tc.getpageObjectManager().getsearchstudent(); 
		 
	 }


		@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	  
	   student.search_student();
		}
}
