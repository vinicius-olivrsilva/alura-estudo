public class ControleEstoque {
    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (this.quantidade < quantidadeVendida) {
            System.out.println("Estoque insuficiente");
        } else {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada. Estoque restante de " +  this.nome + ":  " + this.quantidade);
        }
    }
}