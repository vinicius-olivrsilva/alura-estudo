public class CalculaNotas {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    private void calculaMedia() {
        media = (nota1 + nota2) / 2;
        defineSituacao();
    }

    private void defineSituacao() {
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media > 4){
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
    }

    public void exibeRelatorio(){
        calculaMedia();
        System.out.printf("""
                Aluno: %s
                Nota 1: %.1f
                Nota 2: %.1f
                Média: %.1f
                Situação: %s
                """, nome, nota1, nota2, media, situacao);
    }
}
