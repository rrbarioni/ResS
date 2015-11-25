package generatorProductionReport

import residueGenerator.HarvestSolicitation
import residueGenerator.ResidueGenerator

/**
 * Created by ess on 16/11/15.
 */
class GeneratorProductionReport {
    Date creationDate
    int numberOfGenerators
    int monthsBack


    static hasMany = [harvestSolicitations:HarvestSolicitation]

    def hasGenerator(String withAddress){
        return false;
    }
    def isEmpty(){
        return true
    }
}
