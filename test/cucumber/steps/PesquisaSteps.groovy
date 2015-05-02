package steps

import residueGenerator.ResidueGenerator
import pages.PesquisaPages
import static cucumber.api.groovy.EN.*

Given(~'^Existe no sistema um ponto chamado "([^"]*)"$') { String nomeGerador ->
        GeneratorTestDataAndOperations.createGeneratorName(nomeGerador)
}
When (~'^pesquiso o ponto pelo ponto "([^"]*)"$') { String nomeGerador ->
    assert ResidueGenerator.findByNameGenerator(nomeGerador) == null
}
Then (~'^consigo obter o perfil do "([^"]*)"$'){ String gerador ->
    GeneratorTestDataAndOperations.showGenerator(gerador)
}
Given(~'Eu estou logado na página principal'){ ->
    at PesquisaPages
}
When(~'^pesquiso por "([^"]*)"$'){ String gerador ->
    PesquisaPages.realizarBusca(gerador)
}
Then(~'uma mensagem de erro aparecerá informando que o ponto não existe'){ ->
    assert page.readFlashMessage() != null
}