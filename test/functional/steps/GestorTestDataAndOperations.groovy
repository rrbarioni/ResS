package steps

import gestorGenerator.GestorGenerator
import gestorGenerator.GestorGeneratorController

class GestorTestDataAndOperations{


    static gestors = [

            [nomeDaEmpresa:"RU",
             cNPJ:"77.274.871/0001-28",
             endereco: "Bubble Street number 7",
             telefone:"3452-4412",
             email:"jose@hotmail.com",
            homePage:"supimpa.com.br"],

            [nomeDaEmpresa:"ADUFEPE",
             cNPJ:"29195195",
             endereco:"Bubble Street number 4",
             telefone:"2224-1415",
             email:"maria@hotmail.com",
             homePage:"naosalvo.com.br"],


    ]

    static public def getGestor(){
        return findGestorByCnpj("77.274.871/0001-28")
    }

    static public def findGestorByCnpj(String cnpj) {
        gestors.find { gestor ->
            gestor.cNPJ == cnpj
        }
    }

    static public void createGestor(String cnpj){
        def cont = new GestorGeneratorController()
        def novoGestor = findGestorByCnpj(cnpj)
        cont.params << novoGestor.getProperties()
        cont.create()
        cont.save()
        cont.response.reset()
    }

}
