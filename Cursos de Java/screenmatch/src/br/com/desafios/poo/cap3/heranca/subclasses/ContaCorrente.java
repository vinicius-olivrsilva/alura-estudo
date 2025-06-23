package br.com.desafios.poo.cap3.heranca.subclasses;

import br.com.desafios.poo.cap3.heranca.superclasses.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal() {
        double tarifa = this.getSaldo() * 0.1;
        this.saldo -= tarifa;
        System.out.println("Taxa mensal aplicada!");
        this.consultarSaldo();
    }
}
