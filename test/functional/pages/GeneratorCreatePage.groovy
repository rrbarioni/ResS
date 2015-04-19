package pages
import geb.Page


class GeneratorCreatePage extends Page{

    static url = "residuegenerator/create"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def gerador = gp.getMessage("default.generator.label")
        def titulo = gp.getMessage("default.create.label") + " " + gerador
        title ==~ titulo
    }

    def fillGeneratorDetails(){

        $("form").nameGenerator = "RU"
        $("form").type = "Restaurante"
        $("form").cnpj = "testecnpj1"
        $("form").addressGenerator = "Bubble Street number 7"
        $("form").averageMonthlyMeals = 0
        $("form").averageDailyMeals = 0

    }

    def selectCreateGenerator(){
        $("input", name: "create").click()
    }

}