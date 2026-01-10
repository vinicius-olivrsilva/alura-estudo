package br.com.alura.desafiofinal;

import java.util.Scanner;

// Operações: Consulta saldo, Recebe valor, Transferir valor
public class Menu {
    Scanner src = new Scanner(System.in);
    int opcao;

    public void menu(Cliente cliente) {

        do {
            String menu = """
               Operações
                \s
                 1 - Consultar saldo
                 2 - Receber valor
                 3 - Transferir valor
                 4 - Sair
               \s
               Digite a opção desejada:\s""";
            System.out.println(menu);
            opcao = src.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual R$ %.2f reais \n", cliente.getSaldo());
                    break;
                case 2:
                    System.out.print("Qual o valor que deseja adicionar a conta? ");
                    double addSaldo = src.nextDouble();
                    if (addSaldo <= 0) {
                        System.out.println("Valor inválido");
                    } else {
                        cliente.adicionaSaldo(addSaldo);
                        System.out.println("Valor adicionado com sucesso");
                        System.out.printf("Saldo atual R$ %.2f reais \n", cliente.getSaldo());
                    }
                    break;
                case 3:
                    System.out.print("Qual o valor que deseja transferir para outra conta? ");
                    double removeSaldo = src.nextDouble();
                    if (removeSaldo <= 0){
                        System.out.println("Valor inválido");
                    } else if (removeSaldo > cliente.getSaldo()){
                        System.out.println("Saldo insuficiente para a operação");
                    } else {
                        cliente.removeSaldo(removeSaldo);
                        System.out.println("Valor transferido com sucesso");
                    }
                    System.out.printf("Saldo atual R$ %.2f reais \n", cliente.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (opcao != 4);
    }
}