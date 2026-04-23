package com.alura.pratica.praticandocursos.springcomjpa.capituloum.moedas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Moeda {
    DOLAR(4.98),
    EURO(5.86),
    REAL(1);

    private final double taxa;

    Moeda(double taxa) {
        this.taxa = taxa;
    }

    public double converterPara(double valorEmReais) {
        double resultado = valorEmReais / taxa;
        return new BigDecimal(resultado)
                .setScale(2, RoundingMode.HALF_UP) // 2 casas, arredonda para cima se >= 5
                .doubleValue();
    }
}
