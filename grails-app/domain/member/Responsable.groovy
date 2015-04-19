package member

class Responsable {

    String name
    String email
    String userAddress
    int phone//como implementar vários telefones

    String login
    String password
    static hasMany = [generators: Generator]

    static constraints = {
        name blank: false
        email blank: false, email: true
        userAddress unique: true, nullable: true,maxSize: 40
        login blank: false, nullable: false, unique: true
        password blank: false, nullable: false, unique: false
        phone blank: false, nullable: false, maxSize: 8
    }

    String toString() {
        return name
    }
}
