import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        String senha = "123456";

        System.out.print("Qual é a senha?? ");
        String tentativaSenha = sc.nextLine();

        if (tentativaSenha.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado! ");
        }
    }
}
