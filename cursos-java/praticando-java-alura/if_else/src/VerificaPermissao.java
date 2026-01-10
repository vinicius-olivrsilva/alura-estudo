import java.util.Scanner;

public class VerificaPermissao {
    public static void main(String[] args) {
        Scanner sc = EntradaScanner.getScanner();

        final int codigoAcesso = 2023;
        int nivelPermissao;

        System.out.print("Digite o código de acesso: ");
        int tentativaCodigoAcesso = sc.nextInt();

        System.out.print("Digite o nível de permissão: ");
        int tentativaNivelPermissao = sc.nextInt();

        boolean acessoPorCodigo = codigoAcesso == tentativaCodigoAcesso;
        boolean acessaPorNivel = switch (tentativaNivelPermissao) {
            case 1, 2, 3 -> true;
            default -> false;
        };

        if (acessoPorCodigo && acessaPorNivel) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado: Motivo: ");
            if (!acessoPorCodigo) {
                System.out.println("Código de acesso incorreto");
            }
            if (!acessaPorNivel) {
                System.out.println("Você não tem o nível de permissão adequada para logar no sistema");
            }
        }
    }
}
