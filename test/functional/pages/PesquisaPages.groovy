package pages

import geb.Page

class PesquisaPages extends Page{

    def titulo = "ResidueGenerator Listagem"
    static url = "ResS/residueGenerator/list"

    static at = {
        title ==~ titulo
    }

    def realizarBusca(String gerador) {
        $("form", name: "search").add(gerador)
        $("input", id: "searchButton").click()
    }
}
