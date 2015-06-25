import harvestCompany.HarvestCompany
import residueGenerator.ResidueGenerator

class BootStrap {

    def init = { servletContext ->
        def ru = new ResidueGenerator(
                nameGenerator:"RU",
                type: "Restaurante",
                cnpj: "testecnpj1",
                addressGenerator: "Bubble road number 4",
                averageMonthlyMeals: 0,
                averageDailyMeals: 0
        )

        def stockHarvestCompany1 = new HarvestCompany(name: "Garbage Co")
        def stockHarvestCompany2 = new HarvestCompany( name: "Reciclatron")
        def stockHarvestCompany3 = new HarvestCompany( name: "Clean Planet")

        def stockResidueGenerator = new ResidueGenerator(
                nameGenerator: "Stock Food",
                type: "Restaurante",
                cnpj: "0000000",
                addressGenerator: "Elm Street number 13",
                averageDailyMeals: 30,
                averageMonthlyMeals: 1000,
                hasActiveHarvest: false,
                harvestSolicitation: null
        )

        ru.save(failOnError: true)
        stockResidueGenerator.save(failOnError: true)
        stockHarvestCompany1.save(failOnError: true);
        stockHarvestCompany2.save(failOnError: true);
        stockHarvestCompany3.save(failOnError: true);


    }
    def destroy = {
    }
}
