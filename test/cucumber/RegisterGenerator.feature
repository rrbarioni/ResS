Feature: register a residue generator
  As an administrator of the ResS system
  I want to register residue generators
  So that I can use and manage information of these generators

  Scenario: new valid generator
    Given The system has no generator with the address "Bubble Street number 7"
    When I register a new generator of residue with all the valid info
    And The address "Bubble Street number 7"
    Then The new residue generator is properly stored by the system

  Scenario: new valid generator web
    Given I am at the register new generator page
    And There's no generator with the address "Bubble Street number 7"
    When I fill the generator details with valid info
    And The address "Bubble Street number 7"
    And I register the new generator
    Then I should be on the register a new generator page
    And I should see a message indicating that the action was successful

  Scenario: duplicated residue generator
    Given The system has a generator with the address "Bubble Street number 7" already stored
    When I register a new generator of residue with all the valid info
    And The address "Bubble Street number 7"
    Then The new residue generator is not stored twice by the system

  Scenario: duplicated residue generator web
    Given I am at the register new generator page
    When I register a new generator with the address "Bubble Street number 7"
    And I register a different generator with the address "Bubble Street number 7"
    Then I should be on the register a new generator page
    And I should see an error message indicating that there was already a generator with the same address registered