import java.util.Scanner;

public class VerificaSangue {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Idade do doador: ");
        int idadeDoador = sc.nextInt();
        System.out.print("peso do doador: ");
        int pesoDoador= sc.nextInt();

        boolean idadeValida = idadeDoador >= 18 && idadeDoador <= 65;
        boolean pesoValido = pesoDoador > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }
    }
}
