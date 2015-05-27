package steps

import geb.Page
import pages.ResidueGeneratorListPage
import pages.ResidueGeneratorShowPage
import residueGenerator.ResidueGenerator
import static cucumber.api.groovy.EN.*
//CONTROLLER TESTS

Given(~'^the system has a Residue Generator at "([^"]*)" in it$'){String address ->
    GeneratorTestDataAndOperations.createGeneratorWithDailyMeal(address,0)
    generator = ResidueGenerator.findByAddressGenerator(address)
    assert generator != null
}

When(~'^I create a list with all Residue Generators$'){->
    residueGen = ResidueGenerator.findAll()
    assert residueGen != null
}

Then(~'^a list of results containing a Residue Generator at "([^"]*)" appears$'){String address ->
    residueGen = ResidueGenerator.findAll()
    assert GeneratorTestDataAndOperations.containResidueGenerator(address,residueGen)
}

Given(~'^the system has a Residue Generator at "([^"]*)" with average daily meal of "([^"]*)"$'){String address, int avgDaily ->
    GeneratorTestDataAndOperations.createGeneratorWithDailyMeal(address, avgDaily)
    generator = ResidueGenerator.findByAddressGenerator(address)
    assert generator != null
}

When(~'^I sort the list content by average daily meals$'){->
    residueGeneratorSorted = ResidueGenerator.listOrderByAverageDailyMeals(order: "desc");
    assert GeneratorTestDataAndOperations.isSorted(residueGeneratorSorted);
}

Then(~'^a list of results sorted by daily meals containing a Residue Generator with address "([^"]*)" appears before "([^"]*)"$') { String before, String after ->
    residueGeneratorSorted = ResidueGenerator.listOrderByAverageDailyMeals(order: "desc");
    generatorFirst = ResidueGenerator.findByAddressGenerator(before);
    generatorLatter = ResidueGenerator.findByAddressGenerator(after);
    assert residueGeneratorSorted.indexOf(generatorFirst) < residueGeneratorSorted.indexOf(generatorLatter)
}

//GUI

Given(~'^I am at the Residue Generator Show page$'){ ->
    to ResidueGeneratorShowPage
    at ResidueGeneratorShowPage
}

When(~'^I click on the List Residue Generators button$'){->
    page.selectListResidueGenerators()
}

Then(~'^I am at the Residue Generator List page$'){->
    to ResidueGeneratorListPage
    at ResidueGeneratorListPage
}

Given(~'^I am at the Residue Generators List page$'){->
    to ResidueGeneratorListPage
    at ResidueGeneratorListPage
}

When(~'^I click on the Sort by Average Daily Meal button$'){ ->
    page.selectSortByAverageDailyMeal()
}

Then(~'^a list with Residue Generators sorted by average daily meal appears$'){ ->
    //TODO
}

Given(~'^there are no Residue Generator in the system$') { ->
    residueGen = ResidueGenerator.findAll()
    assert residueGen == null
}

Then(~'^an error message saying there are no stored residue generator should appear$'){->
    def hasMessage = page.hasMessage()
    assert hasMessage != null
}

Then(~'^I am at the Create Residue Generator page$'){
    to GeneratorCreatePage
    at GeneratorCreatePage
}
