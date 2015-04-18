Feature: List of Gerador De Residuo
  As a Coletor de Residuo
  I want to list and sort all Gerador de Residuo
  So that I know all Gerador de Residuo and which Gerador de Residuo are a priority

  #if($list)
  Scenario: list existing Gerador de Residuo
    Given the system has a Gerador de Residuo named "Restaurante Universitario" in it
    When I select the list geradores option
    Then a list of results containing "Restaurante Universitario" appears

  Scenario: sort list of existing Gerador de Residuo by volume of residue
    Given the system has a Gerador de Residuo named "Restaurante Universitario" with volume "10"
    And the system has a Gerador de Residuo named "Cantina da Area 2" with volume "2"
    When I sort the list content by volume
    Then a list of results containing "Restaurante Universitario" before "Cantina da Area 2" appears

  Scenario: display list
    Given I am on the "Indice" page
    And the system has a Gerador de Residuo named "Restaurante Universitario" in it
    When I click on the "Geradores de Residuos" button
    Then I am on the "Gerador de Residuos" page
    And a list of results containing "Restaurante Universitario" appears

  Scenario: sort by volume
    Given I am on the "Geradores de Residuos" page
    When I click on the "Organizar por volume de residuo" button
    Then I am on the "Geradores de Residuos" page
    And the list is sorted by volume

  Scenario: no Gerador de Residuo on system
    Given there are no Gerador de Residuo in the system
    And I am on the "Indice" page
    When I click on the "Geradores de Residuos" button
    Then an error message "Nao ha gerador de residuo para a lista ser organizada" appears
    And I am on the "Gerador de Residuos" page
    #end