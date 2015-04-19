Feature: Pesquisa de pontos de coleta
  As a membro da empresa coletora
  I want to pesquisar pontos de coleta aos quais eu esteja associado
  so that eu possa obter suas informações cadastrais

Scenario: Pesquisa por nome do ponto
  Given Existe no sistema um ponto chamado "RU"
  When pesquiso o ponto pelo seu nome cadastrado
  Then consigo obter o perfil do ponto requerido

Scenario: Pesquisa por nome do administrador do ponto
  Given Existe um administrador de ponto de coleta chamado "Carla Ionara"
  When pesquiso o ponto pelo nome "Carla Ionara"
  Then consigo obter o perfil do ponto requerido

Scenario: Pesquisa de pontos encontrados
  Given Eu seleciono o ícone de pesquisa na página principal
  And pequiso por um nome
  When uma foto uma perfil
  And o nome do ponto de coleta aparecerem na tela
  And seleciono o link da foto
  Then acesso o perfil completo do ponto de coleta

Scenario: Pesquisa de pontos não encontrados
  Given Eu estou logado na página principal
  When seleciono o ícone de pesquisa
  And pesquiso por "Galeto da Esquina"
  Then uma mensagem de erro aparecerá informando que o ponto não existe


