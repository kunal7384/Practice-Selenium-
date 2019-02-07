Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
	Scenario: Setting of User
	When user click on setting and display Setting of that account
	
	Scenario: Create Studen
	When user click on create Student link without filling any data 
	Then Should give error message 
	
	Scenario: LogOut From The Application
	When User click on LogOut Link 
	Then User Should Logout from the Application and Display Logout message
	