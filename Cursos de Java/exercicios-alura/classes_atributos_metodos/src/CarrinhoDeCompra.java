public class CarrinhoDeCompra {
    private String nome;
    private double preco;
    private int quantidade;

    public CarrinhoDeCompra(String nome, double preco, int quantida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantida;
    }

    public double valorTotalItem () {
        return this.preco * this.quantidade;
    }
}
