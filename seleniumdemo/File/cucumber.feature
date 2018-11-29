Feature: Testing mail
	As a tester 
	i need to open mail box and click on draft,also I need to open flipcart and hover over sports section and click on cricket. 
	
	Scenario Outline: using valid login credentials
	Given vaild login details and url
	When i enter "<username>"
	And i enter user "<password>"
	Then i click on submit
	And i click on draft

    
	
	
  Examples:
	|username|password|
	|shrinidhi.harish|$hravan@1107|
	|sreenija.ravi|sree.123|

	Scenario: open the flipcart website
	Given valid url
	When  i hover over Sports,Books & 
   Then click on cricket.