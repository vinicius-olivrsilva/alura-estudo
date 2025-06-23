package br.com.desafios.poo.cap3.heranca.superclasses;

import java.util.ArrayList;

public class NumerosPrimos {
    ArrayList<Integer> primo = new ArrayList();

    public void verificarPrimalidade() {
        System.out.println("??????");
    }

    public void adicionaPrimo(int numeroPrimoGerado) {
        if (!this.primo.contains(numeroPrimoGerado)) {
            this.primo.add(numeroPrimoGerado);
            System.out.println("Numero gerado e adicionado com sucesso!");
        } else {
            System.out.println("Já existe");
        }

    }

    public void listarPrimos() {
        System.out.println(this.primo);
    }
}
