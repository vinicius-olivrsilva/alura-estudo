import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        String nome;

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine().trim();

            if (nome.isBlank() || nome.length() < 3) {
                System.out.println("Nome inválido Digite novamente.");
            }
        } while (nome.isBlank() || nome.length() < 3);

        System.out.println("Nome " + nome + " cadastrado com sucesso!");
    }
}
