package steps

import pages.HarvestSolicitationViewPage
import residueGenerator.ResidueGenerator

//CONTROLLER

/*
>>>>>>> 338ca28a7469bed1e3ccd102638bbf3c817f6d0f
//Scenario: Report generation
Given(~'^that collections were made on "([^"]*)" residue generator on the last month$') { String name ->
	GeneratorTestDataAndOperations.createGeneratorByName(name)
    residueGenerator = ResidueGenerator.findByNameGenerator(name)

    assert residueGenerator != null && residueGenerator.hasMonthlyHarvest
}

When(~'^the system receives a request to generate a report by "([^"]*)" residue generator$') { String name ->
	GeneratorTestDataAndOperations.createReport(residueGenerator)
	reportGenerator = ReportGenerator.findByNameGenerator(name)
}

Then(~'^a report is generated containing those collection’s information$') { ->
	assert reportGenerator != null
}

*/
//GUI
/*
>>>>>>> 338ca28a7469bed1e3ccd102638bbf3c817f6d0f
//Scenario: Generate new report
Given(~'^I am at the HarvestSolicitationViewPage page$'){ ->
	to HarvestSolicitationViewPage
    at HarvestSolicitationViewPage
}

When(~'I select the "Generate Report" option$') { ->
	page.generateReport()
}

And(~'collections were made on the previous month at "RU" residue generator$') { String name ->
	GeneratorTestDataAndOperations.createGeneratorByName(name)
    residueGenerator = ResidueGenerator.findByNameGenerator(name)

    assert residueGenerator != null && residueGenerator.hasMonthlyHarvest
}

Then(~'I see the generated report$') { ->
	printRelatorio()
