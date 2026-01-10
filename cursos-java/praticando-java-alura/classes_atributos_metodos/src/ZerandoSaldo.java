public class ZerandoSaldo {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", getSaldo());
    }

    public void zerarSaldo() {
        setSaldo(0);
    }
}
