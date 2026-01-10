import utilitarias.EntradaScanner;
import utilitarias.FormatadorDeHorario;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner scanner = EntradaScanner.getScanner();
        System.out.print("Digite o horário de entrada (HH:mm): ");
        String entrada = scanner.next();
        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHorariaDiaria = scanner.nextInt();
        System.out.print("Digite o horário real de saída (HH:mm): ");
        String saida = scanner.next();

        LocalTime entradaForm = FormatadorDeHorario.parseHorario(entrada);
        LocalTime saidaForm = FormatadorDeHorario.parseHorario(saida);
        LocalTime saidaPrevista = entradaForm.plusHours(cargaHorariaDiaria);

        System.out.printf("""
                Horário de entrada: %s
                Horário de saída previsto: %s
                Horário real da saída: %s
                """, entradaForm, saidaPrevista, saidaForm);

        Duration d = Duration.between(saidaPrevista, saidaForm);
        long horaExtra = d.toHours();
        long minutosExtra = d.toMinutesPart();

        String sinal = (horaExtra >= 0) ?"(+) ":"(-) ";
        System.out.print("Saldo de horas: "+ sinal + Math.abs(horaExtra) + "h " + Math.abs(minutosExtra) + "min");
    }
}
