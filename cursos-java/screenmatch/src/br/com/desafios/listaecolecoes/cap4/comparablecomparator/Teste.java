package br.com.desafios.listaecolecoes.cap4.comparablecomparator;

public class Teste implements Comparable<Teste>{
    private double saldo;

    public Teste(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Teste outra) {
        if (this.saldo < outra.saldo) {
            return 1;
        } else if (this.saldo > outra.saldo) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "saldo: " + saldo;
    }
}
