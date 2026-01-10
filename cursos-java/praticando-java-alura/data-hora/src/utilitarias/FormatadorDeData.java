package utilitarias;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorDeData {
    private static final DateTimeFormatter formatter_DATA
            = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String formataDataBR(LocalDate data) {
        return data.format(formatter_DATA);
    }

    public static String formataDataBR(ZonedDateTime data) {
        return data.format(formatter_DATA);
    }
}
