package br.com.desafios.poo.cap3.heranca.subclasses;

import br.com.desafios.poo.cap3.heranca.superclasses.Animal;

public class Gato extends Animal {
    public void emiteSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("arranhando Moveis");
    }
}
