import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Média do aluno: ");
        double media = sc.nextDouble();

        if (media >= 7) {
            System.out.println("O estudante teve média "+ media  +" e foi aprovado.");
        } else if (media >= 5) {
            System.out.println("O estudante teve média "+ media  +" está de recuperação.");
        } else if (media < 5 && media > 0){
            System.out.println("O estudante teve média "+ media  +" e foi reprovado");
        } else {
            System.out.println("média inválida");
        }
    }
}
