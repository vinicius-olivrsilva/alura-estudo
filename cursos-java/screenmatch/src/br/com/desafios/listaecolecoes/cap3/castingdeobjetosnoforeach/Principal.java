package br.com.desafios.listaecolecoes.cap3.castingdeobjetosnoforeach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        System.out.println(" 1 - ...");
        ArrayList<Animal> lista = new ArrayList<>();

        System.out.println(" 2 - ...");
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("------ Casting -------");
        Animal animal = cachorro;
        animal.emitirSom();
        ((Cachorro) animal).abanarRabo();

        System.out.println(" 3 - ...");
        Animal animal2 = new Animal();
        lista.add(cachorro);
        lista.add(animal2);

        for (Animal especie : lista) {
            especie.emitirSom();
            if (especie instanceof Cachorro cachorro1) {
                cachorro1.abanarRabo();
            }
        }



        System.out.println(" 4 - ...");
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Ryzen 5 5600", 800);
        Produto produto2 = new Produto("RTX 4060", 2300);
        Produto produto3 = new Produto("SSD 240 Gb", 180);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double total = 0;
        for (Produto produto : listaProdutos) {
            total = total + produto.getPreco();
            System.out.println(produto.getNome());
        }
        System.out.println("Preço médio " + total / listaProdutos.size());

        System.out.println(" 5 - ...");
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            System.out.println(forma.calcularArea());
        }

        System.out.println(" 6 - ...");
        ContaBancaria conta1 = new ContaBancaria(1001, 564);
        ContaBancaria conta2 = new ContaBancaria(1002, 452);
        ContaBancaria conta3 = new ContaBancaria(1003, 490);
        ContaBancaria conta4 = new ContaBancaria(1004, 834);
        ContaBancaria conta5 = new ContaBancaria(1005, 185);

        ArrayList<ContaBancaria> banco = new ArrayList<>();
        banco.add(conta1);
        banco.add(conta2);
        banco.add(conta3);
        banco.add(conta4);
        banco.add(conta5);

        System.out.println("### Jeito com loop ###"); // Forma simples
        ContaBancaria contaMaiorSaldo = banco.get(0);
        for (ContaBancaria conta : banco) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println(contaMaiorSaldo);

        System.out.println("### Melhor jeito segundo ChatGpt ###"); // Usa Streams (Java 8+)
        Optional<ContaBancaria> contaMaiorSaldo2 = banco.stream().max(Comparator.comparingDouble(ContaBancaria::getSaldo));
        contaMaiorSaldo2.ifPresent(System.out::println);
    }
}
