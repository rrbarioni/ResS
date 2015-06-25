package steps

import residueGenerator.ResidueGenerator
import pages.PesquisaPages
import static cucumber.api.groovy.EN.*

Given(~'^Existe no sistema um ponto chamado "([^"]*)"$') { String Gerador ->
    assert GeneratorTestDataAndOperations.createGeneratorName(Gerador) == null
}
When (~'^pesquiso o pelo ponto "([^"]*)"$') { String nomeGerador ->
    assert ResidueGenerator.findByNameGenerator(nomeGerador) != null
}
Then (~'^consigo obter o perfil do "([^"]*)"$'){ String gerador ->
    GeneratorTestDataAndOperations.showGenerator(gerador)
}

Given(~'^Existe um cnpj de ponto de coleta com o numero "([^"]*)"$'){ String cnpj ->
    assert GeneratorTestDataAndOperations.createGeneratorCnpj(cnpj) == null
}

When(~'^pesquiso o ponto pelo cnpj "([^"]*)"$'){ String cnpj ->
    assert ResidueGenerator.findByCnpj(cnpj) != null
}

Then(~'^consigo obter o perfil do ponto com cnpj "([^"]*)"$'){ String cnpj->
    GeneratorTestDataAndOperations.showGeneratorByCnpj(cnpj)
}