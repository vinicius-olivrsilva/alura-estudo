import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraindoHashtagTexto {
    public static void main(String[] args) {
        String texto = "Olá #mundo! Estou aprendendo #Java e #programação.";

        Pattern pattern = Pattern.compile("#[\\p{L}0-9_]+");
        Matcher matcher = pattern.matcher(texto);

        List<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.print("Hashtags encontradas: " + String.join(", ", hashtags));
        }
    }
}
