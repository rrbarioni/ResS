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
        ).save(failOnError: true)
    }
    def destroy = {
    }
}
