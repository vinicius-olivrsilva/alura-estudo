package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    FANTASIA("Fantasy", "Fantasia"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    ANIMACAO("Animation", "Animação");

    private String categoriaOmdb;
    private String categoriaPortuguesBr;

    Categoria(String categoriaOmdb, String categoriaPortuguesBr) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortuguesBr = categoriaPortuguesBr;
    }

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public String getCategoriaOmdb() {
        return categoriaOmdb;
    }

    public String getCategoriaPortuguesBr() {
        return categoriaPortuguesBr;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortuguesBr(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortuguesBr.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
