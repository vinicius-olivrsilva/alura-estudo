package com.alura.pratica.praticandocursos.springcomjpa.capituloum.moedas;

/**
 * 7 - Crie um enum Moeda com valores como DOLAR, EURO, REAL. Cada moeda deve ter uma taxa de conversão para reais.
 * Adicione um método que recebe um valor em reais e retorna o valor convertido para a moeda.
 */

public class MainSete {

    public static void principal() {
        System.out.println(Moeda.DOLAR.converterPara(100));
        System.out.println(Moeda.EURO.converterPara(100));
    }
}
