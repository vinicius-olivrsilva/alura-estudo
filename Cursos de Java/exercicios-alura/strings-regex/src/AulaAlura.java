import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AulaAlura {
    public static void main(String[] args) {
        // Buscando email em uma string
        String texto =  "Meu email é viniciusestudos@eyeker.com";

        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(formatarTelefone("11988885555"));
    }

    // Metodo para formatar numero de telefone com regex
    public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!";
    }
}
