package br.com.desafios.poo.cap2.encapsulamento;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println(contaBancaria);
        IdadePessoa idade = new IdadePessoa();
        idade.setIdade(20);
        idade.verificarIdade();
        idade.setIdade(-13);
        idade.verificarIdade();
        idade.setIdade(200);
        idade.verificarIdade();
        idade.setIdade(8);
        idade.verificarIdade();
        Produto produto = new Produto();
        produto.setPreco(11.9);
        double vinteOff = produto.aplicarDesconto(50);
        System.out.printf("%.2f\n", vinteOff);
        produto.setPreco(8.4);
        vinteOff = produto.aplicarDesconto(40);
        System.out.printf("%.2f", vinteOff);
        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R Tolkien");
        livro.imprimirDetalhes();
        livro.setTitulo("Duna");
        livro.setAutor("Frank Herbert");
        livro.imprimirDetalhes();
    }
}
