package gerenciabiblioteca;

public abstract class Midia {
    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCodigo() {
        String tituloFormatado = titulo.trim();

        String primeirosTres = tituloFormatado.length() >= 3
                ? tituloFormatado.substring(0, 3)
                : tituloFormatado;

        return "LIB-" + primeirosTres + anoPublicacao;
    }

    public void exibirInfo(Object obj) {
        System.out.print("Código: " + gerarCodigo() + " | ");
        if (obj instanceof Livro) {
            System.out.printf("Livro: %s - ", titulo);
        } else if (obj instanceof Revista) {
            System.out.printf("Revista: %s - ", titulo);
        } else {
            System.out.printf("Ebook: %s - ", titulo);
        }
    }
}
