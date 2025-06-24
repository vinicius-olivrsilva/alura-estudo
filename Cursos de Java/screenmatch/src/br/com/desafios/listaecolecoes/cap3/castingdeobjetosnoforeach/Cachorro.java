package br.com.desafios.listaecolecoes.cap3.castingdeobjetosnoforeach;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
