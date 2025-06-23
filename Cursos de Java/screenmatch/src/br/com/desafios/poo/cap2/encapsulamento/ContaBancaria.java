package br.com.desafios.poo.cap2.encapsulamento;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public String toString() {
        return "ContaBancaria{numeroConta=" + this.numeroConta + ", saldo=" + this.saldo + ", titular='" + this.titular + "'}";
    }
}
