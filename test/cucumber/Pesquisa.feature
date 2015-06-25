
Feature: Pesquisa de pontos de coleta
  As a membro da empresa coletora
  I want to pesquisar pontos de coleta aos quais eu esteja associado
  so that eu possa obter suas informações cadastrais

  Scenario: Pesquisa por nome do ponto
    Given Existe no sistema um ponto chamado "RU"
    When pesquiso o pelo ponto "RU"
    Then consigo obter o perfil do "RU"


