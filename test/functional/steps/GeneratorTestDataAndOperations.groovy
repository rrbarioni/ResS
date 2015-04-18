package steps

import residueGenerator.ResidueGeneratorController

class GeneratorTestDataAndOperations{

    static  generators = [

            [nameGenerator:"RU",
             type: "Restaurante",
             cnpj: "testecnpj1",
             addressGenerator: "Bubble Street number 7",
             averageMonthlyMeals: 0,
             averageDailyMeals: 0]
    ]

    static public def findGeneratorByAddress(String address) {
        generators.find { generator ->
            generator.addressGenerator == address
        }
    }

    static public void createGenerator(String address){
        def cont = new ResidueGeneratorController()
        def novoGenerator = GeneratorTestDataAndOperations.findGeneratorByAddress(address)
        //cont.params.putAll(novoGenerator) não consigo passar os parametros
        cont.create()
        cont.save()
        cont.response.reset()
    }

}