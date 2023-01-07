Feature: Login Action 
Scenario: Verify Login With valid data
Given user is on Home page
When user clicks on signin link
Then Next page is displayed with title 
When user enters user name and password clicks on Submit button 
Then check user and displays login successful
When user logs out application should close 
But home page should be there

Scenario: Verify Login With invalid data
Given user is on Home page
When user clicks on signin link
Then Next page is displayed with title 
When user enters invalid  user name or invalid password click on Submit button 
Then check Error message is displayed
