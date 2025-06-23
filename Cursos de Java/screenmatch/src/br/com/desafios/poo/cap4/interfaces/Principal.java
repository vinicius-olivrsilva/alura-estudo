package br.com.desafios.poo.cap4.interfaces;

import br.com.desafios.poo.cap4.interfaces.classessuper.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("##### DESAFIO 1");
        ConversorMoeda converte = new ConversorMoeda();
        double qtdEmDolar = 50;
        converte.converterDolarParaReal(qtdEmDolar);
        System.out.printf("# $%.2f em dolares é R$ %.2f reais\n", qtdEmDolar, converte.converterDolarParaReal(qtdEmDolar));

        System.out.println("\n##### DESAFIO 2");
        CalculadoraSalaRetangular sala  = new CalculadoraSalaRetangular();
        int area = sala.calcularArea(5,8);
        int perimetro = sala.calculaPerimetro(5,8);
        System.out.println("A área é: " + area + " m², e o perímetro é " + perimetro);

        System.out.println("\n##### DESAFIO 3");
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(8);

        System.out.println("\n##### DESAFIO 4");
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(0);
        temperatura.fahrenheitParaCelsius(0);

        System.out.println("\n##### DESAFIO 5");
        Livro livro = new Livro();
        double precoLivro = livro.calcularPrecoFinal(15);
        ProdutoFisico produtoFisico = new ProdutoFisico();
        double precoProduto = produtoFisico.calcularPrecoFinal(15);

        System.out.printf("Preço final do livro R$ %.2f reais\n", precoLivro);
        System.out.printf("Preço final do Produto R$ %.2f reais\n",precoProduto);
    }
}
