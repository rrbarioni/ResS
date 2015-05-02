package pages
import geb.Page
import steps.GeneratorTestDataAndOperations


class GeneratorCreatePage extends Page{

    def titulo = "Create ResidueGenerator"
    static url = "/ResS/residueGenerator/create"

    static at = {

         title ==~ titulo
    }

    def fillGeneratorDetails(){
        GeneratorTestDataAndOperations GTDO = new GeneratorTestDataAndOperations();
        LinkedHashMap gerador = GTDO.getGenerator();
        $("form").nameGenerator = gerador.nameGenerator
        $("form").type = gerador.type
        $("form").cnpj = gerador.cnpj
        $("form").addressGenerator = gerador.addressGenerator
        $("form").averageMonthlyMeals = gerador.averageMonthlyMeals
        $("form").averageDailyMeals = gerador.averageDailyMeals

    }

    def selectCreateGenerator(){
        $("input", name: "create").click()
    }

}