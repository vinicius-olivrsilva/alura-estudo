package gerenciabiblioteca;

public class Main {
    public static void main(String[] args) {
        Midia livro = new Livro("O Hobbit", 1937, "J.R.R. Tolkien");
        Midia revista = new Revista("National Geographic", 2023, 245);
        Midia ebook = new Ebook("Clean Code", 2008, "PDF");

        livro.exibirInfo(livro);
        revista.exibirInfo(revista);
        ebook.exibirInfo(ebook);
    }
}
