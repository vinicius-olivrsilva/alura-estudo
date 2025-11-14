package gerenciabiblioteca;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo(Object obj) {
        super.exibirInfo(obj);
        System.out.printf("Autor: %s\n", autor);
    }
}
