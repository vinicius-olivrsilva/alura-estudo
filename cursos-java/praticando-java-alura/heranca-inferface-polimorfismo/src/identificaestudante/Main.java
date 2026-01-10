package identificaestudante;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bruna", "regular");
        Aluno aluno2 = new Bolsista("Vinicius");

        aluno1.identificar();
        aluno2.identificar();
    }
}
