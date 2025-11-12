import java.util.Scanner;

public class ExtrairNomeArquivoALURA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        // Verifica se há um ponto na string (indicando extensão)
        int indicePonto = nomeArquivo.lastIndexOf('.');

        String nomeSemExtensao;
        if (indicePonto != -1) {
            // Extrai o nome até o ponto
            nomeSemExtensao = nomeArquivo.substring(0, indicePonto);
        } else {
            // Caso não tenha extensão
            nomeSemExtensao = nomeArquivo;
        }

        System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);

        scanner.close();
    }
}
