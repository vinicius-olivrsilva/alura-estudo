import java.util.Scanner;

public class ValidaCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            System.out.printf("O CPF %s está no formato válido", cpf);
        } else {
            System.out.println("nao");
        }
        scanner.close();
    }
}
