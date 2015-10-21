Feature: Confirmation of waste collection
As a residue generator
I want to confirm the collection of my waste
So the other stakeholders can access this information

#if ($confirmaWasteCollection)
Scenario: Confirmation of pending waste collection
Given the system has a waste collection solicitation by “RU” residue generator
And the solicitation is pending
When I confirm the “RU” waste collection
Then the waste collection confirmation is registered

Scenario: Confirmation of a already confirmed waste collection
Given the system has a waste collection solicitation by “RU” residue generator
And this solicitation is already confirmed
When I confirm the “RU” waste collection
Then the confirmation do not overwrite the previous one

Scenario: Confirmation of pending waste collection on the ResS web system
Given I am at the "Waste Collection Solicitation List" page
When I select the waste collection solicitation by “RU” residue generator
And the status of the waste collection solicitation is pending
And I select the "Confirm Collection" button
Then I can see a confirmation message
And I see the confirmation status for the waste collection solicitation on the list

Scenario: Confirmation of a already confirmed waste collection on the ResS web system
Given I am at the "Waste Collection Solicitation List" page
When I select the waste collection solicitation by “RU” residue generator
And the status of the waste collection solicitation is pending
And I select the "Confirm Collection" button
Then I can see a warning message
And I see the confirmation status for the waste collection solicitation on the list
#end