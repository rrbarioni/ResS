package residueGenerator

<<<<<<< HEAD
import org.springframework.dao.DataIntegrityViolationException

=======
>>>>>>> 4cbf37f862ffada963d2383cbe38a3dee9df7cff
class ResidueGeneratorController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

<<<<<<< HEAD
    static public save(ResidueGenerator residueGenerator){
        residueGenerator.save(flush: true)
    }

=======
    def create() {
    }
    def save() {
    }
>>>>>>> 4cbf37f862ffada963d2383cbe38a3dee9df7cff
}
