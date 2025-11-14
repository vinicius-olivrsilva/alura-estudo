import utilitarias.FormatadorDeHorario;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConverteParaFuso {
    public static void main(String[] args) {
        ZonedDateTime horaLocal = ZonedDateTime
                .now(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime horaAustralia = horaLocal.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        String horaLocalFormatada = FormatadorDeHorario.formatarHorario(horaLocal);
        String horaAustraliaFormatada = FormatadorDeHorario.formatarHorario(horaAustralia);
        System.out.println("Horário atual no sistema " + horaLocalFormatada);
        System.out.println("Horário atual no Sydney " + horaAustraliaFormatada);
    }
}
