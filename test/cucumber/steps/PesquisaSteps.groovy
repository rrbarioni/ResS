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