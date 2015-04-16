import javafx.beans.binding.When
import org.hibernate.validator.constraints.br.CNPJ

/**
 * Created by jpms2 on 14/04/2015.
 */
import static cucumber.api.groovy.EN.*



Given(~'^ the system has a cadastre with CNPJ "([^"]*) "$') { String cnpj ->
    TestDataAndOperations.createAccount(cnpj)
    gestor = GestorCadastre.findByCNPJ(cnpj)
    assert gestor == null

}
When(~'^i try to create an account with CNPJ "([^"]*)" $'){ String cnpj ->
    assert gestor != null
}

Then(~'^The account with CNPJ "([^"]*)" is not stored twice in the system $') { String cnpj ->
    assert gestor.size() == 1

}

Given(~'^ i am at the gestor cadastre page  $'){
    to gestorCadastrePage
    at gestorCadastrePage

}
When(~'^i fill the name field with "([^"]*)" CNPJ field with "([^"]*)", address field with "([^"]*)", telephone field with "([^"]*)", \'email field with "([^"]*)" and home page field with "([^"]*)"$'){String name, String cnpj, String address, String telephone, String email, String homepage ->
    page.fillGestorDetails("./test/functional/steps/" + name + cnpj + address + telephone + email + homepage)

}
And(~'^i click the button create account'){
    page.select()
}
Then(~'^the system stores the account with CNPJ "([^"]*)"  properly $'){String cnpj ->
    gestor = GestorCadastre.findByCNPJ(cnpj)
}
And(~'^i am redirected to the home page$'){
    to gestorListPage
    at gestorListPage
}
