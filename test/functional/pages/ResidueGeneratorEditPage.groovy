package pages

import geb.Page
import residueGenerator.ResidueGenerator

class ResidueGeneratorEditPage extends  Page{

    static url = "residuegenerator/Edit"

    static at = {
        GetPageTitle gp = new GetPageTitle()
        def gerador = gp.getMessage("default.generator.label")
        def titulo = gp.getMessage("default.create.label") + " " + gerador
        title ==~ titulo
    }

    static content = {

    }

    def  void edit(String address){
        $('form').address = address
    }

    def submit() {
        $("form").find("input").click()
    }

    def boolean checkFields(){

    }

    def showSuccessMessage(){

    }
}