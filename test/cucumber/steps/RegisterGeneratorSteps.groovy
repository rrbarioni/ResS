package steps

import pages.GeneratorCreatePage
import residueGenerator.ResidueGenerator
import static cucumber.api.groovy.EN.*

/**
 * Created by Arthur on 01/05/2015.
 */

Given(~'^The system has no generator with the address "([^"]*)"$') { String address ->
    generator = ResidueGenerator.findByAddressGenerator(address)
    assert generator == null
}

When (~'^I register a new generator of residue with the address "([^"]*)"$'){String address ->
    endereco = address
    GeneratorTestDataAndOperations.createGenerator(address)

}

Then (~'^The new residue generator is properly stored by the system$'){ ->
    assert ResidueGenerator.findByAddressGenerator(endereco) != null
}


Given(~'^I am at the register new generator page$'){ ->

    to GeneratorCreatePage
    at GeneratorCreatePage

}

When(~'^I fill the generator details with valid info$'){ ->

    page.fillGeneratorDetails()
}

And(~'^I register the new generator$'){ ->
    page.selectCreateGenerator()
}

Then (~'^I should see a message indicating that the action was successful'){ ->
    assert page.readFlashMessage() != null
}
