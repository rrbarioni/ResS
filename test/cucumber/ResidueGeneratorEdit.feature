Feature: Edit the residue generator registration data
  As a residue generator logged into the system
  I want to edit my registration data
  so that i can keep my registration data up to date
 
  Scenario: All the fields are filled correctly
    Given I am at the registration data edit section
    When I fill all the registration data fields correctly
    And I confirm my changes
    Then the system updates my information with success
 
  Scenario: Some of the registration data fields are not filled correctly or are blank
    Given I am at the registration data edit section
    When I fill some of the registration data fields with invalid information or just not fill them
    And I confirm my changes
    Then the system warns me about the blank or the invalid fields
 
  Scenario: The registration data changes results in an existing residue generator
    Given I already filled all the registration data fields correctly
    And submitted the changes by confirming them
    When the system runs the duplicity check algorithm
    And verifies that a residue generator with this registration data already exists
    Then the system should warn me about it
    And must take me back to the edit section so that i can re-fill the fields
 
  Scenario: Residue generator registration data edit success
    Given I am at the residue generator table display screen
    When I click the residue generator registration data edit button
    And Go to the  residue generator registration data edit screen
    And Fill all the fields with their respective valid values
    And click the submit button
    Then The system should take me back to the residue generator table display screen
    And warn me about the successfully made registration data change with an UI resource
 
  Scenario: Residue generator registration data edit fail
    Given I am at the residue generator registration data edit screen
    When I fill some fields not correctly, leave them blank or fill them as such them produce an existing residue generator
    And click the submit button
    Then the system should not change screens
    And must display a visual warning about the correspondent error of my edit process