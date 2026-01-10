package br.com.desafios.listaecolecoes.cap3.castingdeobjetosnoforeach;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta Bancaria - número da conta: " + numeroDaConta +
                " saldo: R$" + saldo;
    }
}
