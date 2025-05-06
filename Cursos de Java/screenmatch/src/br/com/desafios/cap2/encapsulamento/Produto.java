package br.com.desafios.cap2.encapsulamento;

public class Produto {
    private double preco;

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(int percentual) {
        if (percentual > 0 && percentual <= 100) {
            double valorDescontado = this.preco * (double)percentual / (double)100.0F;
            return this.preco - valorDescontado;
        } else {
            throw new IllegalArgumentException("Percentual de percentual inválido: " + percentual);
        }
    }
}
