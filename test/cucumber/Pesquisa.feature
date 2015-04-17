Feature: Pesquisa de pontos de coleta
  As a membro da empresa coletora
  I want to pesquisar pontos de coleta aos quais eu esteja associado
  so that eu possa obter suas informações cadastrais

  Scenario: Pesquisa por nome do ponto
    Given Eu estou logado no sistema
    When pesquiso o ponto pelo seu nome cadastrado
    And o nome realmente existe no sistema
    Then consigo obter o perfil do ponto requerido

  Scenario: Pesquisa por nome do administrador do ponto
    Given Eu estou logado no sistema
    When pesquiso o ponto pelo nome de seu administrador cadastrado
    And o administrador realmente existe no sistema
    Then consigo obter o perfil do ponto requerido

  Scenario: Pesquisa de pontos encontrados
    Given Eu estou logado e na tela inicial "Home"
    When clico no "icone da lupa"
    And digito o nome para pesquisa e teclo "Enter"
    Then uma foto uma perfil do ponto encontrado
    And o seu nome aparecerão na tela
    And clico no link
    And acesso o perfil completo do ponto

  Scenario: Pesquisa de pontos não encontrados
    Given Eu estou logado e na tela inicial "Home"
    When clico no "icone da lupa"
    And digito o nome para pesquisa e teclo "Enter"
    Then uma mensagem de erro aparece informando: "ponto inexistente ou não referenciado pelo nome pesquisado"