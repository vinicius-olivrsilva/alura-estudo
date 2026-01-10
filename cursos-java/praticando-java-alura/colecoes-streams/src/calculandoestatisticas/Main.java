package calculandoestatisticas;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * Calculando estatísticas das notas
 */
public class Main {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        Double notasSomadas = notas.stream()
                .reduce(0.0, Double::sum);

        double mediaDasNotas = notasSomadas / notas.size();

        Double notaMaxima = notas.stream().max(Double::compareTo).orElse(0.0);
        Double notaMinima = notas.stream().min(Double::compareTo).get();
//        Optional<Double> notaMinima = notas.stream().min(Double::compareTo);      //Usa objetos, pode ter overhead de autoboxing/unboxing
//        OptionalDouble notaMin = notas.stream().mapToDouble(Double::doubleValue).min();   //Mais eficiente, trabalha direto com double

        System.out.println("A média das notas é: " + mediaDasNotas);
        System.out.println("A menor nota foi: " + notaMinima);
        System.out.println("A maior nota foi: " + notaMaxima);


        // Forma mais profissional
        var estatisticas = notas.stream()
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();
        System.out.println("Média: " + estatisticas.getAverage());
        System.out.println("Mínimo: " + estatisticas.getMin());
        System.out.println("Máximo: " + estatisticas.getMax());

        /*
        summaryStatistics()
        Esse metodo retorna um objeto DoubleSummaryStatistics, que já traz:

        Metodo          O que retorna
        getAverage()	Média
        getMin()	    Menor valor
        getMax()	    Maior valor
        getSum()	    Soma
        getCount()	    Quantidade de elementos

        Tudo isso em uma única passagem pela stream 🚀
         */
    }
}
