package member

class Generator {

    String nameGenerator // nome do estabelecimento
    String type// tipo de estabelecimento
    String adressGenerator // endereço do gerador não confundir...

    String cnpj
    int averageDailyMeals
    int averageMonthlyMeals
    static belongsTo = [responsable: Responsable]

    static constraints = {

        nameGenerator blank: true // no caso de ser ecoponto pode não ter nome
        type inList: ["Restaurante","Cantina","Ecoponto"]

        adressGenerator blank: false, nullable: false, maxSize: 40
        averageDailyMeals  nullable: true, min: 0
        averageMonthlyMeals  nullable: true, min: 0
        responsable nullable: true
        cnpj blank:true

    }
    String toString(){
        if(!nameGenerator){
            return adressGenerator
        }else{
            return nameGenerator
        }
    }
}
