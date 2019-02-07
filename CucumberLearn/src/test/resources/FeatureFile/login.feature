Feature: Login Action
 
Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters username and password 
 |UserNAme|PassWord|
 |kunal|password|
 Then Message displayed Login Successfully

 Scenario: Search for Any Student and click on it
 Given user login with application 
 When user Enter any name in Search Box
 And should display that searched student and click on it
 Then should open searched studen page 
 
 Scenario: LogOut Functionality
 When User click on LogOut Link 
 Then User Shoulg get log out from Application 
 