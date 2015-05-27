package steps

import cucumber.api.Format
import pages.HistoricoPage
import static cucumber.api.groovy.EN.*
import HistoricoDeColeta.Coleta
import geb.Page

Given (~'^estou na pagina de adicionar coleta$'){ ->
    to HistoricoPage
    at HistoricoPage
}

When (~'^preencho os campos necessarios com informaçoes validas$'){ ->
    page.fillColetaInfo()
}
And (~'^clico em adicionar coleta do dia$'){ ->
    page.selectAdicionarColeta()
}
Then (~'^eh adicionada com sucesso$'){ ->
}






Given(~'^nao foi criada um relatorio de coleta do dia "([^"]*)" do restaurante "([^"]*)"$'){@Format("dd/MM/yyyy") Date dia, String restaurante ->
    coleta = Coleta.findByDataAndNome(dia,restaurante)
    assert coleta == null
}
When (~'^crio um novo relatorio o dia "([^"]*)" do restaurante "([^"]*)"$'){@Format("dd/MM/yyyy") Date dia, String rest ->
    data = dia
    restaurante = rest
    HistoricoTestDataAndOperations.CreateHistorico(rest,dia)
}
Then (~'o relatorio eh adicionado ao historico de coletas$'){ ->
    assert Coleta.findByDataAndNome(data,restaurante) != null
}




Given (~'^ja foi criado o relatorio de coleta do dia "([^"]*)" do restaurante "([^"]*)"$'){@Format("dd/MM/yyyy") Date dia, String restaurante ->
   dat = dia
    rest = restaurante
    c = Coleta.findByDataAndNome(dia,restaurante)
    assert c != null
}

When (~'altero o valor do volume da coleta para "([^\"]*)"$') { int vol ->
    volume = vol
    HistoricoTestDataAndOperations.editColeta(volume, c)
}
Then (~'o valor do volume eh atualizado$') { ->
    c = Coleta.findByDataAndNome(dat,rest)
    assert c.getVolume() == volume
}


Given  (~'^existe uma coleta do dia "([^"]*)" do restaurante "([^"]*)"$'){@Format("dd/MM/yyyy") Date dia, String restaurante ->
    coleta = Coleta.findByDataAndNome(dia,restaurante)
    assert coleta != null
}
When  (~'^seleciono remover esta coleta$'){ ->
    HistoricoTestDataAndOperations.deleteColeta(coleta)
}
Then  (~'^nao existem mais coleta dia "([^"]*)" do restaurante "([^"]*)"$'){@Format("dd/MM/yyyy") Date dia, String restaurante ->
    coleta = Coleta.findByDataAndNome(dia,restaurante)
    assert coleta == null
}