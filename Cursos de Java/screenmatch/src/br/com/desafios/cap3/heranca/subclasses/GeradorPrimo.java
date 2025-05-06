package br.com.desafios.cap3.heranca.subclasses;

import br.com.desafios.cap3.heranca.superclasses.NumerosPrimos;
import java.util.Random;

public class GeradorPrimo extends NumerosPrimos {
    VerificadorPrimo verifica = new VerificadorPrimo();

    public int gerarProximoPrimo() {
        Random random = new Random();

        int numero;
        do {
            numero = random.nextInt(1000);
        } while(!this.verifica.ehPrimo(numero));

        return numero;
    }
}