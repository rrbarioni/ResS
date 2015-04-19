import index.Homepage
import member.Generator
import org.apache.ivy.core.search.SearchEngine
import pages.PesquisaPages
import javax.naming.directory.SearchResult
import static cucumber.runtime.groovy.EN.*

Given(~'^Existe no sistema um ponto chamado "([^"]*)"$') { String gerador ->
    assert Generator.findByNameGenerator(gerador) == null
}
When (~'pesquiso o ponto pelo seu nome cadastrado') { ->
    to SearchResult
    PesquisaPages.fillSearchDetails()
}
Then (~'consigo obter o perfil do ponto requerido'){ ->
    at SearchResult
    PesquisaPages.showSearchResult()
}
Given(~'Eu estou logado na página principal'){ ->
    at Homepage
}
When(~'seleciono o ícone de pesquisa'){ ->
    to SearchEngine
}
And(~'^pesquiso por "([^"]*)"$'){ String gerador ->
    assert Generator.findByNameGenerator(gerador) == null
}
Then(~'uma mensagem de erro aparecerá informando que o ponto não existe'){ ->
    at SearchResult
}