package HistoricoDeColeta

class Coleta {

    String nome // nome do estabelecimento
    Date data // data da coleta
    int volume // volume coletado


    static constraints = {

        nome blank: true // no caso de ser ecoponto pode não ter nome
        data blank: false, nullable: false
        volume  blank: false, nullable: false
    }
    void setNome(String novoNome){
        if(Coleta.findByNomeAndData(novoNome,this.data) == null){
            this.nome = novoNome
        }
    }

}
