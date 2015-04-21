import static cucumber.runtime.groovy.EN.*
import residueGenerator.ResidueGenerator


//import pages.ListResidueGeneratorPage <<Ainda tem de fazer isso>>

Given(~'the system has a Gerador de Residuo named "([^"]*)" in it') { String title ->
    ResidueGeneratorDataAndOperations.createResidueGenerator(title,5f)
    assert ResidueGenerator.findByTitle(title) !=null
}

When (~'^I select the list geradores option') { ->
    residueGen = ResidueGenerator.findAll()
    assert residueGen != null
}

Then(~'^a list of results containing "([^"]*)" appears') { String title ->
    residueGen = ResidueGenerator.findAll()
    assert ResidueGeneratorTestDataAndOPerations.containResidueGenerator(title,residueGen)
}

Given(~'the system has a Gerador de Residuo named "([^"]*)" with volume "([^"]*)"') { String title, float volume ->
    ResidueGeneratorDataAndOperations.createResidueGenerator(title,volume)
    assert ResidueGenerator.findByTitle(title) != null
}

When (~'^I sort the list content by volume') {
    residueGeneratorSorted = ResidueGenerator.listOrderByVolume(order: "asc")
    assert residueGeneratorTestDataAndOperations.isSorted(residueGeneratorSorted, "volume")
}

Then(~'^a list of results containing "([^"]*)" before "([^"]*)" appears') { String former, String latter ->
    //TODO (Como fazer?)
}


Given(~'I am on the "([^"]*)" page') { String title ->
    at ListaGeradorDeResiduoPage
}

Then(~'I am on the "([^"]*)" page') { String title ->
    at ListaGeradorDeResiduoPage
}

When(~'I click on the "([^"]*)" button'){String title ->
    at ListaGeradorDeResiduoPage
    page.selectButton.title
}

Then(~'the list is sorted by volume'){
    //residueGeneratorSorted = ResidueGenerator.listOrderByVolume(order: "asc")
    //assert residueGeneratorTestDataAndOperations.isSorted(residueGeneratorSorted, "volume")
    //TODO (Seria da mesma forma como o 'When?')
}

Given(~'there are no Gerador de Residuo in the system'){
    residueGenerators = ResidueGenerator.findAll()
    assert ResidueGenerators == null
}

Then(~'an error message "([^"]*)" appears') { String message ->
    assert (page.readFlashMessage() !=null)
    //Nao sei se esta correto.
}