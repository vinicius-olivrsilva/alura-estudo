package sistemaescolar;

public class Aluno extends Pessoa{
    private double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        super(nome, idade);
        this.notaFinal = notaFinal;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.2f\n",
                this.getNome(), this.getIdade(), notaFinal);
    }
}
