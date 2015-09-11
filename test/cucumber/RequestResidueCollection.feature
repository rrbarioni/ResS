Feature: Request a new residue collection at a restaurant
  As a restaurant owner
  I want to be able to request a residue collection
  So I can have my residue collected when I need

  #Controller
  Scenario: Request new residue collection
    Given I am logged in the system as a restaurant
    When I register a residue collection request with Nome “RU”, Data “6/August/2010” and Volume “800”
    Then The residue request with Nome “RU”, Data “6/August/2010” and Volume “800” is generated

  Scenario: Failed request new residue collection
    Given I am logged in the system as a restaurant
    When I register a residue collection request with Nome “RU”, Data “6/August/2010” and Volume “0”
    Then The residue request with Nome “RU”, Data “6/August/2010” and Volume “0” is not generated

  #GUI
  Scenario: Request new residue collection
    Given I am at “Create coleta” page
    When I fill the request information with Nome “RU”, Data “6/August/2010” and Volume “800”
    And Select “Create”
    Then I see a confirmation message

  Scenario: Failed request new residue collection
    Given I am at “Create coleta” page
    When I fill the request information with Nome “RU”, Data “6/August/2010” and Volume “0”
    And Select “Create”
    Then I see a error message


