import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VerificaDataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 11, 26);
        LocalDate dataAtual = LocalDate.now();

        Period d = Period.between(dataAtual, dataEvento);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        long dias = ChronoUnit.DAYS.between(dataAtual, dataEvento);

        System.out.println("Data do evento: " + dataEvento.format(formato));
        System.out.println("Data atual: " + dataAtual.format(formato));

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já ocorreu");
        } else {
            System.out.println("O evento será daqui "
                    + d.getMonths() + " meses e "+ d.getDays() + " dias");
        }
    }
}
