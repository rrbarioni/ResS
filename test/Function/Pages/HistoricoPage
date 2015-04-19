package pages
import geb.Page

class RelatorioPage extends Page {

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def gerador = gp.getMessage("default.generator.label")
        def titulo = gp.getMessage("default.create.label") + " " + gerador
        title ==~ titulo
    }


    def selectAdicionarColeta() {
        $("input", name: "adicionar").click()

    }

    def fillValidInfo(Date data){
        $("form").name = "nome"
        $("form").vol = 101
        $("form").date = data

    }
}
