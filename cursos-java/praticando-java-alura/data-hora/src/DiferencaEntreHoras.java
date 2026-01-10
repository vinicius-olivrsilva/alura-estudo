import java.time.Duration;
import java.time.LocalTime;

public class DiferencaEntreHoras {
    public static void main(String[] args) {
        System.out.println("Trabalho na Alfa engenharia:");
        LocalTime inicio = LocalTime.of(5,55);
        LocalTime termino = LocalTime.of(19,0);

        System.out.println("Início: " + inicio);
        System.out.println("Termino: " + termino);

        Duration duracao = Duration.between(inicio, termino);

        System.out.println("Diferença de tempo : "
                + duracao.toHours() + " horas e "
                + duracao.toMinutesPart() + " minutos." );

//        System.out.println("Diferença de tempo :"
//                + duracao.toHours() + " horas e "
//                + duracao.toMinutes() + " minutos." );
    }
}
