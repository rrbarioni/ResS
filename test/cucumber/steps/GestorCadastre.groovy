import javafx.beans.binding.When
import org.hibernate.validator.constraints.br.CNPJ

/**
 * Created by jpms2 on 14/04/2015.
 */
import static cucumber.api.groovy.EN.*



Given(~'^ the system has a cadastre with CNPJ "([^"]*) "$') { String cnpj ->
    gestor = fillGestorDetails.create(cnpj)
    gestor.findByCNPJ(cnpj)
    assert gestor == null

}
When(~'^i try to create an account with CNPJ "([^"]*)" $'){ String cnpj ->
    gestor = fillGestorDetails.create(cnpj)
}

Then(~'^The account with CNPJ "([^"]*)" is not stored twice in the system $') { String cnpj ->
    gestor.findAllByCNPJ(cnpj)
    assert gestor.size() == 1

}

Given(~'^ i am at the gestor cadastre page  $'){
    to gestorCadastrePage
    at gestorCadastrePage


When(~'^i fill all the fields correctly$'){
    page.fillGeneratorDetails()

}
And(~'^i click the button create account'){
    page.selectCreateGestor()
}
Then(~'^the system stores the account with CNPJ "([^"]*)"  properly $'){String cnpj ->
    gestor = GestorCadastre.findByCNPJ(cnpj)
}
And(~'^i am redirected to the home page$'){
    to gestorListPage
    at gestorListPage
}
