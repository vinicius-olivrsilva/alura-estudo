public class CadastroProdutosValidacao {
    private final String nome;
    private double preco;

    public CadastroProdutosValidacao(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido");
            this.preco = 0.0;
        }
    }

    public void exibirDados() {
        System.out.printf("""
                Produto: %s
                Preço: %.2f
                """, getNome(), getPreco());
    }
}
