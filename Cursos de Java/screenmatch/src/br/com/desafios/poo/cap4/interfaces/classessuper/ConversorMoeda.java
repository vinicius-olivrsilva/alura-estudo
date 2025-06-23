package br.com.desafios.poo.cap4.interfaces.classessuper;

import br.com.desafios.poo.cap4.interfaces.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.65;
    }
}
