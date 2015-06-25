package steps

import pages.HomePage
import pages.ResidueGeneratorIndexPage

import static cucumber.api.groovy.EN.*

Given(~'I am at the main page$'){ ->
    to HomePage
    at HomePage
}

When(~'I access the Residue Generator area$'){ ->
    page.selectResidueGeneratorArea()
}

Then(~'I should be at the residue generator index page$'){ ->
    at ResidueGeneratorIndexPage
}