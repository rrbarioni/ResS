
Feature: Pesquisa de pontos de coleta
  As a membro da empresa coletora
  I want to pesquisar pontos de coleta aos quais eu esteja associado
  so that eu possa obter suas informações cadastrais

  Scenario: Pesquisa por nome do ponto
    Given Existe no sistema um ponto chamado "RU"
    When pesquiso o pelo ponto "RU"
    Then consigo obter o perfil do "RU"

  Scenario: Pesquisa por nome do administrador do ponto
    Given Existe um cnpj de ponto de coleta com o numero "testecnpj1"
    When pesquiso o ponto pelo cnpj "testecnpj1"
    Then consigo obter o perfil do ponto com cnpj "testecnpj1"


