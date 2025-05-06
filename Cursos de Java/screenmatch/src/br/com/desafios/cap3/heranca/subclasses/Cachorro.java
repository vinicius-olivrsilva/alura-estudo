package br.com.desafios.cap3.heranca.subclasses;

import br.com.desafios.cap3.heranca.superclasses.Animal;

public class Cachorro extends Animal {
    public void emiteSom() {
        System.out.println("Au Au");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
}
