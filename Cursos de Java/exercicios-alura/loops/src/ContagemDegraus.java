import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        System.out.println("Digite a quantidade de degraus: ");
        int qtdDegraus = sc.nextInt();

        int cont = 1;
        while (cont <= qtdDegraus) {
            System.out.println("Subindo o degrau " + cont);
            cont++;
        }
        System.out.println("Você chegou ao topo!!");
    }
}
