package br.com.alura.parapraticar;

public class Aula02 {
    /*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis
    para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
    Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
    Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira
    para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer
    um casting de valores.*/

    public static void main(String[] args) {
        double temperaturaEmCelsius;
        temperaturaEmCelsius = 22;
        int temperaturaFahrenheit = (int) (temperaturaEmCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura de %f em Celsius é %d em Fahrenheit", temperaturaEmCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);

        // Dolar para reais
        double valorEmDolar = 1.5;
        double valorEmReais = valorEmDolar * 5.62;
        System.out.printf("$ %.2f dolares em reais é R$%.2f",valorEmDolar, valorEmReais);
    }
}
