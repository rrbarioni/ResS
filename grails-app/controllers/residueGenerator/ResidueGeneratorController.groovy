package residueGenerator


class ResidueGeneratorController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]


    static public save(ResidueGenerator residueGenerator){
        residueGenerator.save(flush: true)
    }

    def save() {

    }

}
