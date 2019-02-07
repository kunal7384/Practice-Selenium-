package stepdefination;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pages.StatPage;
import pages.UploadVideoPage;

public class UploadVideoTest {
	
	TestContext tc;
	  UploadVideoPage upload;
 StatPage stat;;
	  
	  
	  public UploadVideoTest(TestContext context)
	  {
		tc = context;  
		  
		upload = tc.getpageObjectManager().getuploadpage();  
		stat = tc.getpageObjectManager().getstatpage();
		  
	  }
	  
	  @Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	        
	         Thread.sleep(6000);
			upload.uploadVideo();
			
			
			stat.getstats();
			
	  }  

}
