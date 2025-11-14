package gerenciabiblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo(Object obj) {
        super.exibirInfo(obj);
        System.out.printf("Edição: %d\n", edicao);
    }
}
