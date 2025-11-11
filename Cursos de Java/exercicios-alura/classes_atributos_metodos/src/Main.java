import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = EntradaScanner.getScanner();

        RelatorioProduto produto = new RelatorioProduto();
        produto.setNome("Mouse Gamer");
        produto.setPreco(159.90);
        produto.setQuantidade(25);
        System.out.println(produto);

        ImprimeResumo livro = new ImprimeResumo();
        livro.setTitulo("O Guia do Mochileiro das Galáxias");
        livro.setAutor("Douglas Adams");
        livro.setNum_paginas(208);
        System.out.println(livro);

        ZerandoSaldo conta = new ZerandoSaldo();
        conta.setSaldo(1579.42);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
        System.out.println();

        ControleTemperatura controle = new ControleTemperatura();
        controle.setLocal("Setor A");
        controle.setTemperaturaAtual(39.2);
        controle.imprimeStatus();

        System.out.println("\nCalcula Notas:");
        CalculaNotas aluno = new CalculaNotas();
        aluno.setNome("Vinicius");
        aluno.setNota1(6.5);
        aluno.setNota2(7.5);
        aluno.exibeRelatorio();

//        System.out.println("\nCorrigindo o cadastro");
//        CorrigeCadastro funcionario = new CorrigeCadastro();
//        System.out.print("Nome: ");
//        funcionario.setNome(scanner.nextLine());
//        System.out.print("Cargo Atual: ");
//        funcionario.setCargo(scanner.nextLine());
//        System.out.print("Nível de acesso atual: ");
//        funcionario.setNivelAcesso(scanner.nextLine());
//        System.out.println("Novo cargo: ");
//        String novoCargo = scanner.nextLine();
//        System.out.println("Novo nível de acesso: ");
//        String novoNivelAcesso = scanner.nextLine();
//        funcionario.atualizaDados(novoCargo, novoNivelAcesso);

        System.out.println("\nControle de tarefas");
        ControleTarefas tarefa1 = new ControleTarefas();
        tarefa1.setDescricao("Estudar Java");
        tarefa1.setConcluida(false);

        ControleTarefas tarefa2 = new ControleTarefas();
        tarefa2.setDescricao("Fazer exercícios");
        tarefa2.setConcluida(true);

        List<ControleTarefas> lista_tarefas = new ArrayList<>();
        lista_tarefas.add(tarefa1);
        lista_tarefas.add(tarefa2);

        for (ControleTarefas tarefa : lista_tarefas) {
            tarefa.imprimeTarefas();
        }

        System.out.println("\nControle de Estoque");
        ControleEstoque item = new ControleEstoque();
        item.setNome("Camiseta");
        item.setQuantidade(10);
        item.vender(3);
        item.vender(8);

        System.out.println("\nMulta Por Atraso");
        MultaPorAtraso pedido = new MultaPorAtraso("Dom Casmurro", 3);
        pedido.exibirDetalhes();
        MultaPorAtraso pedido2 = new MultaPorAtraso("Código Limpo", 1);
        pedido2.exibirDetalhes();

        System.out.println("\nCarrinho de compras");
        CarrinhoDeCompra i1 = new CarrinhoDeCompra("Teclado", 120.00, 1);
        CarrinhoDeCompra i2 = new CarrinhoDeCompra("Mouse", 60.00, 2);
        List<CarrinhoDeCompra> listaCarrinho = new ArrayList<>();
        listaCarrinho.add(i1);
        listaCarrinho.add(i2);
        double valorTotal = 0;
        for (CarrinhoDeCompra itemCarrinho : listaCarrinho) {
            valorTotal += itemCarrinho.valorTotalItem();
        }
        System.out.printf("Total da compra: R$ %.2f", valorTotal);
    }
}
