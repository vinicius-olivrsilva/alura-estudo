package sistemaescolar;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vinicius", 30, 9.5);
        Aluno aluno2 = new Aluno("Oliveira", 25, 7.5);

        Docente docente1 = new Docente("Jiraya", 37, "Java");
        Docente docente2 = new Docente("Jaqueline", 48, "Lógica");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
