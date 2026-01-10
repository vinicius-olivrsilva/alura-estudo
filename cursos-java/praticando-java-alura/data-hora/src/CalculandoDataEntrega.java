import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoDataEntrega {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2025,3,15);
        LocalDate dataFinal = dataInicial.plusDays(17);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("Data de entrega: " + dataFinal.format(formato));
    }
}
