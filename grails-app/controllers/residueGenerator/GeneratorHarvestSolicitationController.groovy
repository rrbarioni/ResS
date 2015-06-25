package residueGenerator

import harvestCompany.HarvestCompany

class GeneratorHarvestSolicitationController {

    def index(long id) {
        def residueGeneratorInstance = ResidueGenerator.get(id)
        if(!residueGeneratorInstance.hasActiveHarvest){
            redirect(action:"create", id : residueGeneratorInstance.id)
            return
        }
        render(view: "index", model: [residueGeneratorInstance: residueGeneratorInstance])
    }

    def create(long id){
        List<HarvestCompany> companyList = HarvestCompany.findAll();
        def harvestSolicitationInstance = new HarvestSolicitation(generatorId: id);
        render(view: "create", model: [harvestSolicitationInstance: harvestSolicitationInstance, companyList:companyList], )
    }

}
