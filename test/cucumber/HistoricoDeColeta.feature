Feature: Gerar historico de coleta
  As a membro da empresa de coleta
  I want to gerar um historico de coletas
  So that eu posso saber o desempenho da minha empresa.



  Scenario Adicionar coleta do dia no sistema
    Given eu estou logado no sistema como administrador
    When estou na pagina de historico de coletas
    And clico no botao gerar historico do dia
    And clico em adicionar coleta do dia
    Then é aberto uma pagina para colocar o registro de coleta do dia


  Scenario Adicionar a pagina de historico de coletas como um cliente
    Given eu estou logado no sistema como cliente
    When estou na pagina Home
    And clico no botao gerar historico de coleta
    Then é aberta a pagina do meu historico de coletas

  Scenario Acessar o historico de coletas do dia como administrador
    Given eu estou logado no sistema como administrador
    When estou na pagina de historico de coletas
    And clico no botao gerar historico do dia
    Then é aberto o historico deste dia

  Scenario Acessar o historico de coletas geral como administrador
    Given eu estou logado no sistema como administrador
    When estou na pagina de historico de coletas
    And clico no botao gerar historico geral
    Then é aberto o historico geral

  Scenario: Documentar coleta
    Given nao foi criada um relatorio de coleta do dia
    When crio um novo relatorio com a data de hoje
    Then o relatorio é adicionado ao historico de coletas

  Scenario: Atualizar relatorio de coleta do dia
    Given ja foi criado o relatorio de coleta do dia
    When seleciono o relatorio do dia
    And atualizo ele
    Then o relatorio será salvo no historico de coletas