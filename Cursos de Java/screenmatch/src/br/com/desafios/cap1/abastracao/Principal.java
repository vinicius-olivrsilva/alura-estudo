package br.com.desafios.cap1.abastracao;


public class Principal {
    public static void main(String[] args) {
        System.out.println("1 - Pessoa");
        Pessoa pessoa = new Pessoa();
        pessoa.imprimeOla();
        System.out.println("2 - Calculadora");
        Calculadora calc = new Calculadora();
        int dobra = calc.dobraNumero(9);
        System.out.println(dobra);
        System.out.println("3 - Musica...");
        System.out.println("4 - Carro");
        Carro carro = new Carro();
        carro.modelo = "Opala";
        carro.ano = 1995;
        carro.cor = "Azul";
        System.out.println(carro);
        carro.idadeDoCarro();
        System.out.println("5 - Aluno...");
    }
}
