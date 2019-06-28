Feature: To perform data extration by filtering out product based on requirement

Scenario: Testing the various components of shopping website
Given proper url and credentials for user login 
When I search for mobiles and click on search button 
Then I get navigated to webpage containing mobiles
And I filter the mobile based on different filters by clicking on radiobuttons
And I filter the mobile based on different filters by checking different checkboxes
And then I sort it based on price
Then I extract the mobile information after filtering from the results found