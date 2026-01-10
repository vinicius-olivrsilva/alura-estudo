public class ControleSaldoBancario {
    private final String titular;
    private double saldoInicial;

    public ControleSaldoBancario(String titular) {
        this.titular = titular;
        this.saldoInicial = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoInicial += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (this.saldoInicial > valor && valor > 0) {
            this.saldoInicial -= valor;
        } else if (valor < 0){
            System.out.println("Valor inválido");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f", titular, saldoInicial);
    }
}
