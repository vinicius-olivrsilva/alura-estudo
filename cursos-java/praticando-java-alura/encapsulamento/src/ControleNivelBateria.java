public class ControleNivelBateria {
    private int nivelBateria;

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria > 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
            exibirStatus();
        } else {
            System.out.println("Nível de bateria inválida");
        }
    }

    public void exibirStatus() {
        System.out.print("Status: ");
        if (this.nivelBateria <= 20) {
            System.out.println("Bateria fraca");
        } else if (this.nivelBateria < 80) {
            System.out.println("Bateria ok");
        } else {
            System.out.println("Bateria cheia");
        }
    }
}
