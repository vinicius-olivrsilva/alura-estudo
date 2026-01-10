package br.com.desafiofinal.principal;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas = 0;
    private double classificacaoImdb;

    public void curtir () {
        this.curtidas++;
    }

    // Get
    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getClassificacaoImdb() {
        return classificacaoImdb;
    }

    // Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibeStatus () {
        String imprimeDados = """
                *********************
                Título: %s
                Total de Reproduções: %d
                Total de Curtidas: %d
                Nota: %.1f""".formatted(this.getTitulo(), this.getTotalDeReproducoes(), this.getCurtidas(), this.getClassificacaoImdb());
        System.out.println(imprimeDados);
    }

    public void votaImdb(int nota) {
        this.classificacaoImdb = nota / 10.0;
    }
}
