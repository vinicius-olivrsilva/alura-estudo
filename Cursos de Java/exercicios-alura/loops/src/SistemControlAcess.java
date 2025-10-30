import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemControlAcess {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();
        List<String> lista_convidados = new ArrayList<>();
        String entrada;

        while (true) {
            System.out.print("Digite o nome do convidado " +
                    "(ou \"ver\" para visualizar a lista, \"sair\" para terminar): ");
            entrada = sc.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (entrada.equalsIgnoreCase("ver")) {
                if (lista_convidados.isEmpty()) {
                    System.out.println("A lista de convidados ainda está vazia.");
                } else {
                    System.out.println("Lista atualizada de convidados: " + lista_convidados);
                }
                continue;
            }

            boolean jaExiste = false;
            for (String convidado : lista_convidados) {
                if (convidado.equalsIgnoreCase(entrada)) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                lista_convidados.add(entrada);
                System.out.println(entrada + " foi adicionado à lista de convidados.");
            } else {
                System.out.println("O nome " + entrada + " já está na lista de convidados.");
            }
        }
    }

//    private static String formatarNome(String nome) {
//        if (nome.isEmpty()) {
//            return nome;
//        }
//        // Converte o nome em letras minúsculas e então capitaliza a primeira letra
//        String lowerCaseName = nome.toLowerCase();
//        return lowerCaseName.substring(0, 1).toUpperCase() + lowerCaseName.substring(1);
//    }
}
