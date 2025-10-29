import java.util.Scanner;

public class VerificaDiaUtil {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String dia = sc.nextLine();

//        switch (dia) {
//            case "segunda", "terça", "quarta", "quinta", "sexta":
//                System.out.println(dia + " é dia útil");
//            break;
//            case "domingo", "sabado":
//                System.out.println(dia + " é fim de semana");
//                break;
//            default:
//                System.out.println("Dia inválido");
//        }

        if (dia.equals("segunda") || dia.equals("terca") ||
                dia.equals("quarta") || dia.equals("quinta") ||
                dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " é fim de semana.");
        }
    }
}
