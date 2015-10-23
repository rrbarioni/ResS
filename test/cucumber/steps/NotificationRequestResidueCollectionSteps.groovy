package steps

import pages.HarvestSolicitationViewPage
import pages.SolicitacaoColetaViewPage
import residueGenerator.HarvestSolicitation
import residueGenerator.ResidueGenerator
import static cucumber.api.groovy.EN.*


Given (~'^that the system receives a request by "([^"]*)" for an email to be resent$') { String name ->

    SolicitacaoColetaTestDataAndOperations.createGeneratorByName(name)
    residueGenerator = ResidueGenerator.findByNameGenerator(name)

    assert residueGenerator != null && residueGenerator.hasActiveHarvest
}


When (~'^the system confirms that there are pending requests$') {
    SolicitacaoColetaTestDataAndOperations.createHarvestSolicitationByGenerator(residueGenerator)
    harvestSolicitation = HarvestSolicitation.findByResidueGenerator(residueGenerator)

    assert residueGenerator.harvestSolicitation != null && harvestSolicitation != null && harvestSolicitation.status == "Pending"
}


Then (~'^the system resends the email with the data of the pending requests to the city hall and the researcher$') { ->
//resend email is not implemented yet
}

<<<<<<< HEAD
And(~'^ generates a notification of email sending confirmation$') {
=======
And(~'^generates a notification of email sending confirmation$') {
>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
//not implemented yet
}



//GUI

<<<<<<< HEAD
Given(~'^I am logged into the restaurant account in which I work$') { ->
    //login not implemented yet
}

And(~'^I’m on the page of requested collections$'){ ->
    to SolicitacaoColetaViewPage
    at SolicitacaoColetaViewPage
}
And (~'^there has been a open collection request for some time$') { ->
//not implemented yet
}

When(~'^I select the "resend email notification" button$') {
 // not implemented yet
}

Then(~'^I see a confirmation message$') { ->
	to SolicitacaoColetaViewPage
=======
Given(~'I am on the page of requested collections$'){ ->
    to SolicitacaoColetaViewPage
    at SolicitacaoColetaViewPage
}
And (~'there has been a open collection request for some time$') { ->
    to SolicitacaoColetaViewPage
    at SolicitacaoColetaViewPage
}

When(~'I select the "resend email" button$') {
   page.resendEmail()
}

Then(~'I see a confirmation message$') { ->
    to SolicitacaoColetaViewPage
>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    at SolicitacaoColetaViewPage
    assert !page.hasOk()
}
