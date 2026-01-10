import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DataAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";

        if (!tarefa.isEmpty()) {
            imprimeLog();
        }
    }
    public static void imprimeLog() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        System.out.println(dataAtual);
        System.out.println(horaAtual);
    }
}
