Feature: Periodic Collection Report of a Specific Location
As a restaurant owner
I want to generate a report
So I can see the collections made on the time period  			

#GUI

Scenario: Generate new report
Given I am at the collections page
When I ask the system to generate a new report of the collections made in the last month
And collections were made on the previous month
Then I see the generated report

Scenario: Generate empty report
Given I am at the home page
When I ask the system to generate a new report of the collections made in the last month
And no collections were made on the previous month
Then I see an empty report error message
And no report is shown

#CONTROLLER

Scenario: Report generation
Given the system has a request to generate a report by a restaurant
When the system confirms that collections were made on that restaurant on the last month
Then a report is generated containing those collection’s informations

Scenario: Empty report generation
Given the system has a request to generate a report by a restaurant
When the system finds that no collections were made on that restaurant on the last month
Then a empty report message is generated
