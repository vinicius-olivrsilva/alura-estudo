import java.util.ArrayList;
import java.util.List;

public class RegistroDeNotas {
    private final String disciplina;
    private final List<Double> notas;

    public RegistroDeNotas(String disciplina) {
        this.disciplina = disciplina;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    private void totalNotasValidas() {
        System.out.println("Total de notas válidas: " + notas.size());
    }

    private double calculaMedia() {
        if (notas.isEmpty()) return 0;

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void exibeStatus() {
        totalNotasValidas();
        System.out.printf("Média em %s: %.2f", disciplina, calculaMedia());
    }
}
