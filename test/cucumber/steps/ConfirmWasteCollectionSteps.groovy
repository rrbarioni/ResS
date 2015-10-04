package steps

import pages.CreateHarvestSolicitationPage
import pages.HarvestSolicitationViewPage
import residueGenerator.HarvestSolicitation
import residueGenerator.ResidueGenerator

import static cucumber.api.groovy.EN.*

Given (~'^the system has a waste collection solicitation by "([^"]*)" residue generator$') { String name ->

    CreateHarvestSolicitationTestDataAndOperations.createGeneratorByName(name)
    residueGenerator = ResidueGenerator.findByNameGenerator(name)

    assert residueGenerator != null && residueGenerator.hasActiveHarvest
}

And (~'^the solicitation is pending$') {

    CreateHarvestSolicitationTestDataAndOperations.createHarvestSolicitationByGenerator(residueGenerator)
    harvestSolicitation = HarvestSolicitation.findByResidueGenerator(residueGenerator)

    assert residueGenerator.harvestSolicitation != null && harvestSolicitation != null && harvestSolicitation.status == "Pending"
}

When (~'^I confirm the "([^"]*)" waste collection$') { String name ->

    harvestSolicitation.status == "Confirmed"
    residueGenerator.hasActiveHarvest == false
    residueGenerator.harvestSolicitation == null

}

Then (~'^the waste collection confirmation is registered$') {

    assert HarvestSolicitation.findByResidueGenerator(residueGenerator) != null && HarvestSolicitation.findByStatus("Confirmed") != null && HarvestSolicitation.findBySolicitationDate(harvestSolicitation.solicitationDate) != null

}

//GUI
/*Scenario: Confirmation of pending waste collection on the ResS web system
Given I am at the HarvestSolicitationViewPage page
When I select the "Confirm Collection" button
Then I can see a confirmation message
And I can see the fields for making a new waste collection solicitation*/

Given(~'I am at HarvestSolicitationViewPage page$'){ ->
    to HarvestSolicitationViewPage
    at HarvestSolicitationViewPage
}

When(~'I select the "Confirm Collection" button$') {
    page.confirmCollection()
}

Then(~'I can see a confirmation message$') {

    //implement
    //check if we need to do the front

}

And(~'I I can see the fields for making a new waste collection solicitation$') {

    to CreateHarvestSolicitationPage
    at CreateHarvestSolicitationPage

}



