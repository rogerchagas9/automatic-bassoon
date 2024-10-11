public class Tarefa {
    //private
    private String descricao;

    //construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
        public String getDescricao(){
            return descricao;
    }

    public String toString (){

        return "Tarefa{" + 
        "descrição = '" + descricao + '\'' +
        '}';
     }

}
