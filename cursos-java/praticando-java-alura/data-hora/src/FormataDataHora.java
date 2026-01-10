import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormataDataHora {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        String dataFormatada = formataData(data);
        String horaFormatada = formataTime(hora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }

    public static String formataData(LocalDate data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formato.format(data);
    }

    public static String formataTime(LocalTime hora) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        return formato.format(hora);
    }
}
