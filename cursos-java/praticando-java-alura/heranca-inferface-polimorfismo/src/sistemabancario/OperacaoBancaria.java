package sistemabancario;

public abstract class OperacaoBancaria implements Acaobancaria{
    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
