package br.com.desafios.poo.cap3.heranca.subclasses;

import br.com.desafios.poo.cap3.heranca.superclasses.NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos {
    public boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}