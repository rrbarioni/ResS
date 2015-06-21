package residueGenerator

class ResidueGenerator {

    String nameGenerator // nome do estabelecimento
    String type// tipo de estabelecimento
    String addressGenerator // endereço do gerador não confundir...

    String cnpj
    int averageDailyMeals
    int averageMonthlyMeals


    static constraints = {

        nameGenerator nullable:true,blank:true // no caso de ser ecoponto pode não ter nome
        type inList: ["Restaurante","Cantina","Ecoponto"], nullable:false, blank:false

        addressGenerator blank: false, nullable: false, maxSize: 40, unique: true
        averageDailyMeals  nullable: false, min: 0,blank:false
        averageMonthlyMeals  nullable: false, min: 0,blank:false

        cnpj blank:false, nullable:false

    }
    String toString(){
        if(!nameGenerator){
            return addressGenerator
        }else{
            return nameGenerator
        }
    }
}