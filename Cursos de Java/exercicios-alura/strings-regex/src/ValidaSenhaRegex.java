import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaSenhaRegex {
    public static void main(String[] args) {
        String senha = "Senha@2025";

        Pattern pattern = Pattern
                .compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()) {
            System.out.println("A senha é válida");
        } else {
            System.out.println("A senha é inválida");
            System.out.println(senha);
        }
    }
}
