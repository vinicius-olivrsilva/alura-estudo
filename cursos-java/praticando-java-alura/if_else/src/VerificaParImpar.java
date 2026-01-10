import java.util.Scanner;

public class VerificaParImpar {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Digite o número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par. ", num);
        } else {
            System.out.printf("O número %d é ímpar. ", num);
        }

//        Se o curso não fosse de if-else...
//        String ImparOuPar = (num % 2 == 0)? "par" : "ímpar";
//        System.out.printf("O número %d é %s.", num, ImparOuPar);
    }
}
