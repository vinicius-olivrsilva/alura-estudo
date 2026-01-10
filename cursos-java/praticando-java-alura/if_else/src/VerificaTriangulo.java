import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.print("Digite o primeiro lado: ");
        double lado1 = sc.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = sc.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3
                && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo. ");
        } else {
            System.out.println("Os lados não podem formar um triângulo. F");
        }
    }
}
