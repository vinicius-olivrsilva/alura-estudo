import java.util.Scanner;

public class MonitorandoLogins {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        final String SENHA_CORRETA = "2025";
        final int MAX_TENTATIVAS = 4;
        String senha;

        for (int tentativa = MAX_TENTATIVAS; tentativa > 0; tentativa--) {

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA) ){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativa > 1){
                System.out.println("Senha incorreta. Você tem "+ (tentativa - 1) +" tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
    }
}
