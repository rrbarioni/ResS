package pages
import geb.Page
import steps.HistoricoTestDataAndOperations


class HistoricoPage extends Page {

    def titulo = "Adicionar Coleta"
    static url = "/ResS/HistoricoColeta/adicionar"

    static at = {

        title ==~ titulo
    }

    def selectAdicionarColeta() {

        $("input", name: "adicionar").click()

    }

    def fillColetaInfo(){
        HistoricoTestDataAndOperations HTDO = new HistoricoTestDataAndOperations()
        LinkedHashMap coleta = GTDO.getGenerator();

        $("form").nome = coleta.nome
        $("form").volume = coleta.volume
        $("form").data = coleta.data

    }
}