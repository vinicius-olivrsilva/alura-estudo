public class SistemasPontosAlunos {
    private final String nome;
    private int pontos;
    private int nivel;

    public SistemasPontosAlunos(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(int novosPontos) {
        this.pontos = novosPontos;
        this.atualizaNivel();
    }

    public void atualizaNivel() {
        nivel = (this.pontos / 100) + 1;
    }

    public String exibirStatus() {
        return """
                Nome: %s
                Pontos: %d
                Nível: %d
                """.formatted(nome, pontos, nivel);
    }
}
