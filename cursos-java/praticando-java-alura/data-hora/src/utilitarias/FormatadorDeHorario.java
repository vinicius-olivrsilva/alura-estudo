package utilitarias;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorDeHorario {
    private static final DateTimeFormatter FORMATTER_HORA =
            DateTimeFormatter.ofPattern("HH:mm");

    public static String formatarHorario(LocalTime horario) {
        return horario.format(FORMATTER_HORA);
    }

    public static String formatarHorario(ZonedDateTime horario) {
        return horario.format(FORMATTER_HORA);
    }

    public static LocalTime parseHorario(String texto) {
        return LocalTime.parse(texto, FORMATTER_HORA);
    }
}
