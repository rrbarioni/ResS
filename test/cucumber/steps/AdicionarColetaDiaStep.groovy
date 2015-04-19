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
   def  data = HistoricoDeColetas.findByDia(dia)
    assert data == null

}
When (~'^preencho os campos necessarios com informaçoes validas e com a data "([^"]*)"$'){
    HistoricoDeColetas.fillValidTest(data)

}


And (~'^clico em adicionar coleta do dia$'){ ->


}

Then (~'^é adicionada com sucesso$'){ ->
    coleta = HistoricoDeColetas.findByDia(dia)
    assert coleta != null
}

And (~'^sou direcionado para a homepage$'){ ->
    to HomePage
    at HomePage
}
