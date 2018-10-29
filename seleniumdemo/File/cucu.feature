Feature: Testing mail
	As a tester 
	i need to open mail box and click on 5 th mail
	
	Scenario: using valid login credentials
	
	Given vaild login details and url
	When i enter "shrinidhi.harish"
	And i enter user "$hravan@1107"
	Then i click on submit
	And five th  mail is selected and clicked.
