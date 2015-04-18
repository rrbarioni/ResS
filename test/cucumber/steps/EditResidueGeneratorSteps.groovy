import geb.Page
import pages.ResidueGeneratorEditPage
import residueGenerator.ResidueGenerator
import residueGenerator.ResidueGeneratorController
import pages.GetPageTitle

import static cucumber.runtime.groovy.EN.*

Given(~'^the system has a residue generator with the address "([^"]*)"$') { String address ->
    residueGen = ResidueGenerator.findByAddressGenerator(address)
    assert residueGen != null
}

When (~'^I change it to "([^"]*)"$') {  String newAddress ->
    residueGen.setAddressGenerator(newAddress)
    updatedAddress = newAddress
    ResidueGeneratorController.save(residueGen)
}

Then(~'^the system should store the residue generator with the new address in the data base$') { ->
    updatedResidueGen = ResidueGenerator.findByAddressGenerator(updatedAddress)
    assert updatedResidueGen != null
}


Given(~'^I am at the residue generator edit page'){ ->
    to ResidueGeneratorEditPage
    at ResidueGeneratorEditPage
}

When(~'^I fill the address field with "([^"]*)"'){String address ->
    ResidueGeneratorEditPage.edit(address)
}

And(~'^fill all the required fields correctly'){
    def isValid = ResidueGeneratorEditPage.checkFields()
    assert isValid == false
}

And(~'^submit my changes'){
    ResidueGeneratorEditPage.submit()
}

Then(~'^I should see a message indicating that the changes are properly stored'){
    ResidueGeneratorEditPage.showSuccessMessage()
}

