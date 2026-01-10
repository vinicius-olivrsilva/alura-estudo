import java.util.Scanner;

public class EncontreOMaior {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Digite os números separados por espaço: ");
        String[] lista_numeros = sc.nextLine().split(" ");

        int maior = Integer.MIN_VALUE;
        for (String numString : lista_numeros) {
            int num = Integer.parseInt(numString);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: "+ maior);
    }
}
