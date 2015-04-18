package residueGenerator

import org.springframework.dao.DataIntegrityViolationException

class ResidueGeneratorController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    static public save(ResidueGenerator residueGenerator){
        residueGenerator.save(flush: true)
    }

}
