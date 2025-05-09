package br.com.desafios.cap4.interfaces.classessuper;

import br.com.desafios.cap4.interfaces.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.printf("A temperatura de %.1f ºC graus Celsius para Fahrenheit é %.1f ºF graus\n", temperatura, fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double celsius = (temperatura - 32) / 1.8;
        System.out.printf("A temperatura de %.1f ºF graus Fahrenheit para Celsius é %.1f ºC graus\n", temperatura, celsius);
    }
}
