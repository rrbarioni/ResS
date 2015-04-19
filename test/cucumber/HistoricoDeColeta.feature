Feature: Gerar historico de coleta
  As a membro da empresa de coleta
  I want to gerar um historico de coletas
  So that eu posso saber o desempenho da minha empresa.



  Scenario Adicionar coleta do dia no sistema
    Given nao foi adicionado historico de coleta do dia "08/04/2015"
    When preencho os campos necessarios com informaçoes validas e data "08/04/2015"
    And clico em adicionar coleta do dia
    Then é adicionada com sucesso
    And sou direcionado para a homepage

  @ignore
  Scenario Adicionar a pagina de historico de coletas como um cliente
    Given eu estou logado no sistema como cliente
    And estou na pagina Home
    When clico no botao gerar historico de coleta
    Then é aberta a pagina do meu historico de coletas
  @ignore
  Scenario Acessar o historico de coletas do dia como administrador
    Given eu estou logado no sistema como administrador
    When estou na pagina de historico de coletas
    And clico no botao gerar historico do dia
    Then é aberto o historico deste dia
  @ignore
  Scenario Acessar o historico de coletas geral como administrador
    Given eu estou logado no sistema como administrador
    When estou na pagina de historico de coletas
    And clico no botao gerar historico geral
    Then é aberto o historico geral

  Scenario: Documentar coleta
    Given nao foi criada um relatorio de coleta do dia "08/04/2015"
    When crio um novo relatorio o dia "08/04/2015"
    Then o relatorio do dia "08/04/2015" é adicionado ao historico de coletas
  @ignore
  Scenario: Atualizar relatorio de coleta do dia
    Given ja foi criado o relatorio de coleta do dia
    When seleciono o relatorio do dia
    And atualizo ele
    Then o relatorio será salvo no historico de coletas



