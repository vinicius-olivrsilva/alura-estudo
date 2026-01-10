public class ControleTemperatura {
    private String local;
    private double temperaturaAtual;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void alerta() {
        System.out.println("Alerta: temperatura acima do limite!!!");
    }

    public void imprimeStatus () {
        System.out.println("Sensor no local: " + getLocal());
        System.out.println("Temperatura: " + getTemperaturaAtual());
        if (temperaturaAtual > 37.5) {
            alerta();
        }
    }
}
