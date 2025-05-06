package br.com.desafios.cap3.heranca;

import br.com.desafios.cap3.heranca.subclasses.Cachorro;
import br.com.desafios.cap3.heranca.subclasses.ContaCorrente;
import br.com.desafios.cap3.heranca.subclasses.Gato;
import br.com.desafios.cap3.heranca.subclasses.GeradorPrimo;
import br.com.desafios.cap3.heranca.subclasses.ModeloCarro;
import br.com.desafios.cap3.heranca.subclasses.VerificadorPrimo;
import br.com.desafios.cap3.heranca.superclasses.Animal;

public class Principal {
    public static void main(String[] args) {
        System.out.println("DESAFIO 1");
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setModelo("Gol");
        carro1.setValorAno2023((double)1200.0F);
        carro1.setValorAno2024((double)1750.25F);
        carro1.setValorAno2025(3302.17);
        carro1.exibeCarro();
        System.out.println("\n\nDESAFIO 2");
        Cachorro husk = new Cachorro();
        Gato gato = new Gato();
        Animal jumento = new Animal();
        Animal baleia = new Cachorro();
        Animal passaro = new Gato();
        husk.emiteSom();
        gato.emiteSom();
        jumento.emiteSom();
        baleia.emiteSom();
        passaro.emiteSom();
        System.out.println("Testes de instancias");
        husk.abanarRabo();
        gato.arranharMoveis();
        System.out.println("\n\nDESAFIO 3");
        ContaCorrente contaV = new ContaCorrente();
        contaV.setNome("Vinícius Oliveira");
        contaV.depositar((double)2000.0F);
        contaV.consultarSaldo();
        contaV.cobrarTarifaMensal();
        contaV.cobrarTarifaMensal();
        contaV.cobrarTarifaMensal();
        contaV.consultarSaldo();
        contaV.consultarSaldo();
        System.out.println("\n\nDESAFIO 3");
        VerificadorPrimo primo = new VerificadorPrimo();
        GeradorPrimo numeroGerado = new GeradorPrimo();
        int numero = numeroGerado.gerarProximoPrimo();
        primo.adicionaPrimo(numero);
        numero = numeroGerado.gerarProximoPrimo();
        primo.adicionaPrimo(numero);
        numero = numeroGerado.gerarProximoPrimo();
        primo.adicionaPrimo(numero);
        primo.listarPrimos();
        System.out.println(primo.ehPrimo(16));
    }
}
