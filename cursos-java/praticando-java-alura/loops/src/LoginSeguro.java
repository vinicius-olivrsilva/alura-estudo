import java.util.Scanner;

public class LoginSeguro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        final int MAX_TENTATIVAS = 3;

        for (int tentativas = MAX_TENTATIVAS; tentativas > 0; tentativas--) {
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }

        scanner.close();
    }
}

