package br.com.desafios.listaecolecoes.cap3.castingdeobjetosnoforeach;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;                  //Upcast
        Animal animal2 = new Cachorro();

        cachorro.emitirSom();
        animal.emitirSom();
        animal2.emitirSom();

        cachorro.abanarRabo();
       // animal.abanarRabo();                                // Downcast
       // animal2.abanarRabo();                               // Downcast
       // Mesmo que animal e animal2 estejam apontando para objetos da classe Cachorro,
       // o compilador só permite chamar métodos que existem no tipo da variável, ou seja, Animal.

       //Se você tem certeza de que animal é um Cachorro, pode fazer um downcast:
        ((Cachorro) animal).abanarRabo();    // OK
        ((Cachorro) animal2).abanarRabo();   // OK
    }
}
