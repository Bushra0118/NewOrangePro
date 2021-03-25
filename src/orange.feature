@smokeTest 
Feature: Orange HRM Automation 
	Description: End to End Testing of Orange HRM website
@tc_001
Scenario: User logged In 
	Given User is on OrangeHRM website 
	When User Enters UserName 
	And User Enters Password 
	And User Click Login button 
	Then User login as a Paul 
@tc_002
Scenario: Validate the NY Sales Office Data 
	Given User Login to website as a Paul user 
	When User click on Location which is inside Admin and then Organization 
	And User enters Location Name 
	And User click on Search Button 
	Then User gets New York Sales office data 
