Feature: Edit the residue generator registration data
  As a residue generator logged into the system
  I want to edit my registration data
  so that i can keep my registration data up to date

  Scenario: All the fields are filled correctly
    Given I want to change my residue generator address to "Fool's street number 0"
    When  I fill all the required fields correctly
    And   confirm my changes
    Then  the changes are properly saved by the system

