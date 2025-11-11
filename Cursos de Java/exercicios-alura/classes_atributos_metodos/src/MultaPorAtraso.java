public class MultaPorAtraso {
    private String titulo;
    private int diasAtraso;

    public MultaPorAtraso(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    private double calculaMulta() {
        double multaPorDia = 2.50;
        return multaPorDia * diasAtraso;
    }

    public void exibirDetalhes() {
        if (diasAtraso > 0) {
            double multa = calculaMulta();
            String dias = (diasAtraso > 1)? "dias" : "dia";
            System.out.printf("Livro: %s | Multa por %d %s de atraso: R$ %.2f.\n", titulo, diasAtraso, dias, multa);
        }
    }
}
