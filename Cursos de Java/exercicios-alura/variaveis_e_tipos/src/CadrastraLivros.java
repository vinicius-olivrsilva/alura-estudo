public class CadrastraLivros {
    public static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numPaginas = 96;
        double preco = 39.9;

        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }


        System.out.println("Livro cadastrado: "+ titulo +
                ", de " + autor + ". Ele possui "+ numPaginas +" páginas, custa R$ " + preco +
                " e pertence à categoria " + categoriaDescricao + ".");
    }
}
