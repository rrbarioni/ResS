Feature:Informar pontos a coletar
  As um coletor de resíduos
  So that eu possa saber onde ir fazer a coleta
  I want to ver e imprimir uma lista de pontos a coletar

  Scenario: Pontos disponíveis
    Given Eu estou na página de pontos a coletar
    And Os pontos "Restaurante Universitário" e "Cantina da Área 2" são os únicos com quantidades de resíduos acima do mínimo para coleta
    Then Devo ver uma lista que contenha apenas os pontos "Restaurante Universitário" e "Cantina da Área 2", com as respectivas informações de contato e de quantidade

  Scenario: Nenhum ponto disponível
    Given Eu estou na página de pontos a coletar
    And Não há pontos com quantidade de resíduos acima do mínimo para coleta
    Then Devo ver uma mensagem indicando que não há pontos prontos para coleta

  Scenario: Ponto em estado crítico
    Given Eu estou vendo os Pontos disponíveis
    And O ponto "Restaurante Universitário" está com quantidade de resíduos acima do limite crítico de "20 litros"
    Then Devo ver uma mensagem indicando que há pontos em estado crítico
    And O item de "Restaurante Universário" da lista deve estar destacado indicando estado crítico

  Scenario: Imprimir Lista
    Given Eu estou vendo os Pontos disponíveis
    And Eu seleciono a opção Imprimir
    Then A lista de pontos de coleta deve ser imprimida pelo computador