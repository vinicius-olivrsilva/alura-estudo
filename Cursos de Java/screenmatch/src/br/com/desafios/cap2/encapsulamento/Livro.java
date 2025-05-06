package br.com.desafios.cap2.encapsulamento;

public class Livro {
    private String titulo;
    private String autor;

    public void imprimirDetalhes() {
        String mensagem = "\n# Livro\nTítulo do livro: %s\nAutor: %s\n".formatted(this.titulo, this.autor);
        System.out.print(mensagem);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
