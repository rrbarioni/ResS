/**
 * Created by ess on 18/11/15.
 */

package steps

import pages.GeneratorCreatePage
import pages.ResidueGeneratorShowPage
import residueGenerator.ResidueGenerator
import generatorProductionReport.GeneratorProductionReport

import static cucumber.api.groovy.EN.*

// Scenario: generate month based Residue Production report
//Given the system has a residue generator at “endereco” registered
//When the system generate the general production report for the last "5" months
//Then the residue generator at “endereco” appears at the report

Given(~'^the system has a residue generator at "([^"]*)" registered$'){ String address ->

}

When(~'^the system generate the general production report for the last "([^"]*)" months'){String months->

}

Then(~'^Then the residue generator at "([^"]*)" appears at the report') {String address->

}

//  Scenario: generate empty month based Residue Production report
//Given the system has no registered residue Generator
//When the system generates an production report for the last "5" months
//Then then report is empty

Given(~'^the system has no registered residue Generator'){

}

Then(~'^then report is empty'){

}

//  Scenario: generate month based Residue Production report web
//Given I am at the Residue Generator Report page
//When I click ask the system to produce a report based on the last "5" months
//Then I am at the Report Waste Production page

Given('I am at the Residue Generator Report page'){

}
When('I click ask the system to produce report based on the last "([^"]*)" months'){String months->

}
Then('I am at the Report Waste Production page'){

}

// Scenario: generate empty month based Residue Production report web
//Given I am at the Residue Generator Report page
//And the system has no registered residue Generator
//When I click ask the system to produce a report based on the last "5" months
//Then I am at the Report Waste Production page
//And the report is empty

And(~'^the system has no registered residue Generator'){

}
And(~'^the report is empty'){

}
