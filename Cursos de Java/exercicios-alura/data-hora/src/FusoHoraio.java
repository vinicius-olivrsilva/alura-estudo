import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHoraio {
    public static void main(String[] args) {
        ZonedDateTime horaTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horário atual em Tóquio: " + horaTokyo.format(formatoHora));
    }
}
