package steps

import pages.ColetaCreatePage
import pages.ColetaListPage
import HistoricoDeColeta.Coleta
import static cucumber.api.groovy.EN.*


//Updated by Ricardo Barioni on 19/10/2015


//CENARIO CONTROLADOR:
//Scenario: Blank Name input
<<<<<<< HEAD
/*
Given (~'^I am logged in the system as a restaurant$'){ ->
=======

Given (~'^I am logged in the system as a restaurant$'){ ->

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    //login not implemented yet
}

When (~'^I register a residue collection request with Name "([^"]*)"$'){String name ->
<<<<<<< HEAD
    keepName = name
    CreateColetaTestDataAndOperations.createColetaWithName(name)
}

Then (~'^The residue request is not generated$'){ ->
    assert Coleta.findByName(keepName) == null
=======
    CreateColetaTestDataAndOperations.createColetaWithName(name)
}


Then (~'^The residue request with name "([^"]*)" is not generated$'){String name ->
    assert Coleta.findByNome(name) == null
>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
}

//CENARIO CONTROLADOR:
//Scenario: Invalid volume input

<<<<<<< HEAD
Given (~'^I am logged in the system as a restaurant$'){ ->
=======
Given (~'^I am logged on the system as a restaurant$'){ ->
>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    //login not implemented yet
}

When (~'^I register a residue collection request with Volume "([^"]*)"$'){String volume ->
<<<<<<< HEAD
    keepVolume = volume
    CreateColetaTestDataAndOperations.createColetaWithVolume(volume)
}

Then (~'^The residue request is not generated$'){ ->
    assert Coleta.findByVolume(keepVolume) == null
=======
    CreateColetaTestDataAndOperations.createColetaWithVolume(volume)
}

Then (~'^The residue request with volume "([^"]*)" is not created$'){String volume ->
    assert Coleta.findByVolume(volume) == null

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
}

//CENARIO GUI:
//Scenario: Blank Name input

<<<<<<< HEAD
=======

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
Given (~'^I am at creating collection page$'){ ->
    to ColetaCreatePage
    at ColetaCreatePage
}

<<<<<<< HEAD
=======

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
When (~'^I fill the request information with Name "([^"]*)"$'){String name ->
    page.fillName(name)
}

<<<<<<< HEAD
And (~'^I fill the other fields$'){ ->
    page.fillDataAndVolume()
}

And (~'^Select “Create”$'){ ->
    page.submit()
}

Then (~'^I see a error message$'){ ->
=======
And (~'^I fill data and volume fields$'){ ->
    page.fillDataAndVolume()
}

And (~'^Choose "Create"$'){ ->
    page.submit()
}

Then (~'^I should see a error message$'){ ->

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    to ColetaListPage
    at ColetaListPage
    assert page.hasErrors()
}

//CENARIO GUI:
//Scenario: Invalid volume input

<<<<<<< HEAD
Given (~'^I am at creating collection page$'){ ->
=======
Given (~'^I am on creating collection page$'){ ->

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    to ColetaCreatePage
    at ColetaCreatePage
}

When (~'^I fill the request information with Volume "([^"]*)"$'){String volume ->
    page.fillVolume(volume)
}

<<<<<<< HEAD
And (~'^I fill the other fields$'){ ->
    page.fillNameAndData()
}

And (~'^Select “Create”$'){ ->
=======
And (~'^I fill name and data fields$'){ ->
    page.fillNameAndData()
}

And (~'^Select "Create"$'){ ->
>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    page.submit()
}

Then (~'^I see a error message$'){ ->
<<<<<<< HEAD
=======

>>>>>>> 6ab03349cde6522d49cbe70516b785527b473582
    to ColetaListPage
    at ColetaListPage
    assert page.hasErrors()
}*/
