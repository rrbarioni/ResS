Feature:Informar pontos a coletar
    As um coletor de resíduos
    So that eu possa saber onde ir fazer a coleta
    I want to ver e imprimir uma lista de pontos a coletar

  Scenario: Pontos disponíveis
    Given Eu estou na página de pontos a coletar
    And Há pontos com quantidade de resíduos acima do mínimo para coleta
    Then Devo ver uma lista dos pontos de coleta por visitar, com as informações de contato e de quantidade por coletar deve ser mostrada

   Scenario: Nenhum ponto disponível
     Given Eu estou na página de pontos a coletar
     And Não há pontos com quantidade de resíduos acima do mínimo para coleta
     Then Devo ver uma mensagem indicando que não há pontos prontos para coleta

    Scenario: Ponto em estado crítico
      Given Eu estou vendo os Pontos disponíveis
      And O ponto "Restaurante Universitário" está com quantidade de resíduos próxima do limite máximo
      Then Devo ver uma mensagem indicando que há pontos em estado crítico
      And O item de "Restaurante Universário" da lista deve estar destacado indicando estado crítico

     Scenario: Imprimir Lista
      Given Eu estou vendo os Pontos disponíveis
      And Eu Seleciono a opção Imprimir
      Then A lista de pontos de coleta deve ser imprimida pelo computador