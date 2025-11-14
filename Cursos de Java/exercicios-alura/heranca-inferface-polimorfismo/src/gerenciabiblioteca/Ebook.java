package gerenciabiblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInfo(Object obj) {
        super.exibirInfo(obj);
        System.out.printf("Formato: %s\n", formato);
    }
}
