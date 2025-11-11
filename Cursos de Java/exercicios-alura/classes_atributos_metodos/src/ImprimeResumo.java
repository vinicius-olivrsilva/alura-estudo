public class ImprimeResumo {
    private String titulo;
    private String autor;
    private int num_paginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    @Override
    public String toString() {
        return """
               ImprimeResumo:
                %s de %s com %d páginas.
               """.formatted(getTitulo(), getAutor(), getNum_paginas());
    }
}
