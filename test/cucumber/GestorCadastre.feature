Feature: Gestor cadastre

  As an administrator
  I want to cadastre a new account
  So that I can use and manage information of these gestors


  Scenario: Gestor cadastre

    Given the system has no cadastre with CNPJ "77.274.871/0001-28"
    When i create the account with CNPJ "77.274.871/0001-28"
    Then the account is stored properly in the system



  Scenario: gestor cadastre with CNPJ already in use

    Given the system has a cadastre with CNPJ "77.274.871/0001-28"
    When i create the account with CNPJ "77.274.871/0001-28"
    Then the account is not stored in the system


  Scenario: gestor cadastre with Phone number field not containing only numbers

    Given that i want to cadastre a new gestor
    When i create an account with Phone number field "fa22-gja2"
    Then the account is not stored in the system


  Scenario: gestor cadastre web

    Given i am at the gestor cadastre page
    When i fill all the registration data fields correctly
    And i click the button "create my account"
    Then the system stores the account properly

  Scenario: gestor cadastre with CNPJ already in use web

    Given that i am at the gestor cadastre page
    And the system has a cadastre with CNPJ "77.274.871/0001-28"
    When i fill the CNPJ field with "77.274.871/0001-28"
    And i click the button "Create my account"
    Then the system doesn't store the account

  Scenario: gestor cadastre with phone number field not containing only numbers

    Given i am at the gestor cadastre page
    When i fill the "phone number" field with "fa22-gja2"
    And i click the button "Create my account"
    Then the system doesn't store the account