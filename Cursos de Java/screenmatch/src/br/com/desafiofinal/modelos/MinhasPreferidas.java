package br.com.desafiofinal.modelos;

import java.util.concurrent.ThreadLocalRandom;

public class MinhasPreferidas {
    // Gera o numero aleatorio das notas aqui
    public int geraCurtRepro(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
}
