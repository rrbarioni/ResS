# ResS_Project

Grails 2.1.5
ChromeDriver 2.1.5
JDK 1.7.0_65 SDK 7
Cucumber 0.10.0
Geb 0.9.2
Selenium 2.39.0

-------------------------------------------------------------------------------------------------------------------

Mark as Test Source todas as subpastas imediatas de test (não as subpastas das subpastas)
Em GebConfig.groovy setar caminho do chromeDriver no File (2.1.5)

-------------------------------------------------------------------------------------------------------------------

Arquivos Modificados:

conf.BuildConfig
cucumber.support.env.groovy
cucumber.CucumberGebSupport.gdsl
functional.GebConfig.groovy
conf.spring.CucumberConfig.groovy
-------------------------------------------------------------------------------------------------------------------

P/ testar:  test-app -Dgeb.env=chrome functional:cucumber

-------------------------------------------------------------------------------------------------------------------

Integração com o Travis-ci
Entre em https://travis-ci.org/
Selecione o botão no canto superior direito "Sign in with github"
Clique em seu nome no canto superior direito
Pressione o botão cinza "Sync" caso seus repositórios não estejam aparecendo
Caso os repositórios não aparecam, dê log out e entre novamente
Escolha o repositório que deseja testar, no caso o Ress, e clique no botão cinza para que ele se torne verde
Faça um commit qualquer para ativar a build do travis
Caso você queira ver mais do stacktrace utilize "--verbose" logo após o comando "--stacktrace" no arquivo .travis.yml do seu repositório
Para receber emails sobre se a build passou ou não, ative seu email no perfil do github

-------------------------------------------------------------------------------------------------------------------

Produção: http://frozen-earth-8120.herokuapp.com/
