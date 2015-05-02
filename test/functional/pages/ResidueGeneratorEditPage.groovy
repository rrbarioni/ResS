package pages

import geb.Page
import steps.GeneratorTestDataAndOperations

class ResidueGeneratorEditPage extends Page{

    def titulo = "Edit ResidueGenerator"
    static url = "/ResS/residueGenerator/edit/1"

    static at = {
        title ==~ titulo
    }

    def fillAddressField(String address){
        $("form").addressGenerator = address
    }

    def fillOtherFields() {
        GeneratorTestDataAndOperations GTDO = new GeneratorTestDataAndOperations();
        LinkedHashMap gerador = GTDO.getGenerator();
        $("form").nameGenerator = gerador.nameGenerator
        $("form").type = gerador.type
        $("form").cnpj = gerador.cnpj
        $("form").averageMonthlyMeals = gerador.averageMonthlyMeals
        $("form").averageDailyMeals = gerador.averageDailyMeals
    }

    def submitChanges(){
        $("input", name: "edit").click()
    }



}