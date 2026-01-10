import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoDataVencimento {
    public static void main(String[] args) {
        LocalDate vencimento = LocalDate.of(2025, 3, 20);
        LocalDate novoVencimento = vencimento.plusMonths(3);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Nova data de vencimento: "+ novoVencimento.format(f));
    }
}
