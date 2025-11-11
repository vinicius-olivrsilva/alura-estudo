import java.util.ArrayList;
import java.util.List;

public class AvaliacaoFilmes {
    private final String titulo;
    private final List<Integer> avaliacoes;

    public AvaliacaoFilmes(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int avaliacao) {
        if (avaliacao > 0 && avaliacao <= 5) {
            avaliacoes.add(avaliacao);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    private double calculaAvalicao() {
        double somaAvaliacoes = 0;
        for (Integer avaliacao : avaliacoes) {
            somaAvaliacoes += avaliacao;
        }
        return somaAvaliacoes / avaliacoes.size();
    }

    public void exibeMedia() {
        double mediaAvaliacoes = calculaAvalicao();
        System.out.printf("Média de avaliações para %s: %.2f",
                this.getTitulo(), mediaAvaliacoes);
    }
}
