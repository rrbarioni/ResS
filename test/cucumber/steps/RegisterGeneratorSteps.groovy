import pages.GeneratorCreatePage
import residueGenerator.ResidueGenerator
import steps.GeneratorTestDataAndOperations

import static cucumber.runtime.groovy.EN.*


Given(~'^The system has no generator with the address "([^"]*)"$') { String address ->

    generator = ResidueGenerator.findByAddressGenerator(address)
    assert generator == null

}

When (~'^I register a new generator of residue with the address "([^"]*)"$'){String address ->
    endereco = address
    GeneratorTestDataAndOperations.createGenerator(address)

}

Then (~'^The new residue generator is properly stored by the system$'){
    assert ResidueGenerator.findByAddressGenerator(endereco) != null
}


Given(~'^I am at the register new generator page$'){
    //Arity mismatch.???
    to GeneratorCreatePage
    at GeneratorCreatePage
}

When(~'^I fill the generator details with valid info$'){
    at GeneratorCreatePage
    page.fillGeneratorDetails()
}

And(~'^I register the new generator$'){
    at GeneratorCreatePage
    page.selectCreateGenerator()
}

Then(~'I should be on the register a new generator page$') {
    at GeneratorCreatePage
}

And (~'^I should see a message indicating that the action was successful'){
    assert page.readFlashMessage() != null
}




