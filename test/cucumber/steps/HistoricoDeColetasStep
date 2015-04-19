


/**
 * Created by Túlio on 14/04/2015.
 */

Given (~'^estou na pagina de adicionar coleta$'){ ->
    to LoginPage
    at LoginPage
    page.fillLoginData("admin", "adminadmin")
    at HomePage
    page.select("Adicionar Coleta")
    at AdicionarColetaPage
}

And (~'^nao foi adicionado historico de coleta do dia "([^"]*)"$'){Date dia ->
    at AdicionarColetaPage
    def  data = HistoricoDeColetas.findByDia(dia)
    assert data == null
}

When (~'^preencho os campos necessarios com informaçoes validas e com a data "([^"]*)"$'){
    coleta = HistoricoDeColetas
    HistoricoTestDataAndOperations.fillValidInfo(data)
}
And (~'^clico em adicionar coleta do dia$'){ ->
    Relatoriopage.selectAdicionarColeta()
}
Then (~'^é adicionada com sucesso$'){ ->
    coleta = HistoricoDeColetas.findByDia(dia)
    assert coleta != null
}
And (~'^sou direcionado para a homepage$'){ ->
    to HomePage
    at HomePage
}

Given(~'^nao foi criada um relatorio de coleta do dia "([^"]*)"$'){ Date dia ->
    data = HistoricoDeColetas.findByDia(dia)
    assert data == null
}
When (~'^crio um novo relatorio do dia "([^"]*)"$'){ Date dia ->
    HistoricoTestDataAndOperations.CreateHistorico("nome",101,dia)
}
Then (~'^o relatorio do dia "([^"]*)" é adicionado ao historico de coletas$'){ Date dia ->
    assert HistoricoDeColetas.findByDia(dia) != null
}



