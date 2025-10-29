import java.util.Scanner;

public class VerificaIntervalo {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.println("Digite o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();

        if (emprestimo >=  1000 && emprestimo <= 5000) {
            System.out.println("Emprestimo de " + emprestimo + " realizado com sucesso!");
        } else {
            System.out.println("O valor "+ emprestimo +", não está dentro do intervalo permitido para empréstimo. ");
        }
    }
}
