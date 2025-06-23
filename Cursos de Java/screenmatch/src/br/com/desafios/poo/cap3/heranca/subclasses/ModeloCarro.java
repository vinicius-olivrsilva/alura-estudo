package br.com.desafios.poo.cap3.heranca.subclasses;

import br.com.desafios.poo.cap3.heranca.superclasses.Carro;
import java.util.Arrays;

public class ModeloCarro extends Carro {
    public void exibeCarro() {
        System.out.println("Modelo: " + this.modelo);
        System.out.printf("Valor em 2023: R$ %.2f reais\n", this.getValorAno2023());
        System.out.printf("Valor em 2024: R$ %.2f reais\n", this.getValorAno2024());
        System.out.printf("Valor em 2025: R$ %.2f reais\n", this.getValorAno2025());
        double precoMedio = this.calculaPrecoMedio(this.getValorAno2023(), this.getValorAno2024(), this.getValorAno2025());
        System.out.printf("Preço médio: R$ %.2f reais\n", precoMedio);
        this.exibeOMaior();
    }

    public void exibeOMaior() {
        double maior = Math.max(this.getValorAno2023(), Math.max(this.getValorAno2024(), this.getValorAno2025()));
        double menor = Math.min(this.getValorAno2023(), Math.min(this.getValorAno2024(), this.getValorAno2025()));
        System.out.printf("O maior valor é: R$ %.2f reais\n", maior);
        System.out.printf("O menor valor é: R$ %.2f reais\n", menor);
        System.out.println("Testando outra função");
        double[] numeros = new double[]{this.getValorAno2023(), this.getValorAno2024(), this.getValorAno2025()};
        Arrays.sort(numeros);
        System.out.print("Numeros em ordem crescente: ");

        for(double valores : numeros) {
            System.out.printf("R$ %.2f ", valores);
        }

    }
}
