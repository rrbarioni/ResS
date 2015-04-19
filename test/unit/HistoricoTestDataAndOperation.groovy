/**
 * Created by Túlio on 19/04/2015.
 */

static  Historico = [
        [nome:"nome",
         volume: 101,
         data: 08/05/2015]
]


static public void CreateHistorico(String nome, int vol, Date data){
    def cont = new HistoricoColetasController()
    def novoHistorico = HistoricoTestDataAndOperations.findGeneratorByAddress(data)
    //cont.params.putAll(novoHistorico) não consigo passar os parametros
    cont.create()
    cont.save()
    cont.response.reset()
}
