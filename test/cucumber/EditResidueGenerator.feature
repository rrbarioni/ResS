Feature: Edit the residue generator registration data
  As a residue generator logged into the system
  I want to edit my registration data
  so that i can keep my registration data up to date

  #if ($ All the fields are filled correctly)

  Scenario: All the fields are filled correctly
    Given the system has a residue generator with the address "Bubble Street number 4"
    When I change it to "Fool street number 0"
    Then the system should store the residue generator with the new address in the data base
  #end

  #if ($Residue generator registration data edit success web page)

  Scenario: Residue generator registration data edit success web page
    Given I am at the residue generator edit page
    When  I fill the address field with "Fool's street number 0"
    And   fill all the required fields correctly
    And   submit my changes
    Then  I should see a message indicating that the changes are properly stored
  #end

  @ignore
  Scenario: Some of the registration data fields are not filled correctly or are blank
    Given I am at the registration data edit section
    When  I fill some of the registration data fields with invalid information or just not fill them
    And   I confirm my changes
    Then  the system warns me about the blank or the invalid fields

  @ignore
  Scenario: The registration data changes results in an existing residue generator
    Given I already filled all the registration data fields correctly
    And   submitted the changes by confirming them
    When  the system runs the duplicity check algorithm
    And   verifies that a residue generator with this registration data already exists
    Then  the system should warn me about it
    And   must take me back to the edit section so that i can re-fill the fields

  @ignore
  Scenario: Residue generator registration data edit fail
    Given I am at the residue generator registration data edit screen
    When  I fill some fields not correctly, leave them blank or fill them as such them produce an existing residue generator
    And   click the submit button
    Then  the system should not change screens
    And   must display a visual warning about the correspondent error of my edit process