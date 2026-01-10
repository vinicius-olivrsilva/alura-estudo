package sistemabancario;

public class Deposito extends OperacaoBancaria {
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Deposito de R$ %.2f realizado\n", getValor());
    }
}
