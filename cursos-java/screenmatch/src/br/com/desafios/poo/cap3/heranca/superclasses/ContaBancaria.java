package br.com.desafios.poo.cap3.heranca.superclasses;

public class ContaBancaria {
    private String nome;
    protected double saldo;

    public String getNome() {
        return this.nome;
    }

    protected double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double valor) {
        if (valor > (double)0.0F) {
            this.saldo += this.saldo + valor;
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Valor incorreto");
        }

    }

    public void sacar(double valor) {
        if (!(valor > this.saldo) && !(valor < (double)0.0F)) {
            this.saldo -= valor;
        } else {
            System.out.println("impossível sacar, saldo insuficiente ou valor negativo");
        }

    }

    public void consultarSaldo() {
        System.out.println("Cliente: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}