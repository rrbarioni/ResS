//Modified by Ricardo Barioni

package HistoricoDeColeta

import cucumber.api.Format

class Coleta {

    String nome // nome do estabelecimento
    Date data // data da coleta
    int volume // volume coletado


    static constraints = {

        nome blank: false // ecoponto deve possuir um nome para identificação
        data blank: false, nullable: false
        volume  blank: false, nullable: false, notEqual: 0 // volume para coleta não deve ser 0. deve-se haver algo a ser coletado
    }

    static List returnSearch(Date d1, Date d2){

        List coletas = Coleta.createCriteria().list() {
            between('data', d1, d2)
        }

        return coletas

    }

    void setName(String novoNome){
        if(Coleta.findByNomeAndData(novoNome,this.data) == null){
            this.nome = novoNome
        }
    }

    void setDate(@Format("dd/MM/yyyy")Date novaData){
        if(Coleta.findByNomeAndData(this.nome,novaData) == null){
            this.data = novaData
        }
    }
}
