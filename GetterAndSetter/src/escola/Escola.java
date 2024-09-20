package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno roger = new Aluno();
        roger.setNome("roger");
        roger.setIdade(8);

        System.out.println("O aluno " + roger.getNome() + " tem " + roger.getIdade() + " anos");
    }
}