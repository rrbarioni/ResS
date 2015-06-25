package residueGenerator

class HarvestSolicitation {

    String harvester;
    int harvesterId;
    int generatorId;
    String status;
    int estimatedAmountOfResidue;
    Date solicitationDate;
    ResidueGenerator residueGenerator;

    static belongsTo = [residueGenerator : ResidueGenerator]

    static constraints = {
        harvester nullable: false,blank: false
        harvesterId nullable:false,blank:false,unique:true
        generatorId nullable:false,blank:false,unique:true
        status nullable:false,blank:false
        solicitationDate nullable:false,blank:false
        estimatedAmountOfResidue nullable:false,blank:false
    }
}
