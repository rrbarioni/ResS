package steps

import pages.ResidueGeneratorShowPage
import steps.GestorTestDataAndOperations
import pages.GestorCreatePage
import gestorGenerator.GestorGenerator
import static cucumber.api.groovy.EN.*

Given(~'^the system has no cadastre with CNPJ "([^"]*)"$') { String cnpj ->
    gestor = GestorGenerator.findByCNPJ(cnpj)
    assert gestor == null

}
When(~'^i try to create an account with CNPJ "([^"]*)"$'){ String cNPJ ->
    cnpj = cNPJ
    GestorTestDataAndOperations.createGestor(cNPJ)
}

Then(~'^the account is stored properly in the system$') { ->
    assert GestorTestDataAndOperations.findGestorByCnpj(cnpj) != null

}


Given(~'^i am at the gestor cadastre page$') { ->
    to GestorCreatePage
    at GestorCreatePage
}
    When(~'^i fill all the registration data fields correctly$') { ->
        page.fillGestorDetails()
    }
    And(~'^i click the button "create my account"') { ->
        page.selectCreateGestor()
    }
    Then(~'^the system stores the account properly$') { ->

    }
    And(~'^i am redirected to the home page$') {  ->
        to ResidueGeneratorShowPage
        at ResidueGeneratorShowPage
    }
