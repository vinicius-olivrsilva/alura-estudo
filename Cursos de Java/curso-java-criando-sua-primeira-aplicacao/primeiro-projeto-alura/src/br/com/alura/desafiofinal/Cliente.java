package br.com.alura.desafiofinal;

public class Cliente {
    private String nome;
    private double saldo;

    public void imprimeDadosCliente() {
        String mensagem = """
                *****************************************
                Dados iniciais do Cliente:
                
                Nome:               %s
                Tipo de Conta:      %s
                Saldo Inicial:      %.2f
                *****************************************
                """.formatted(getNome(), getTipoConta(), getSaldo());
        System.out.println(mensagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return "Conta Corrente";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // OPERAÇões
    public void adicionaSaldo(double addSaldo){
        setSaldo(getSaldo() + addSaldo);
    }

    public void removeSaldo(double removeSaldo){
        setSaldo(getSaldo() - removeSaldo);
    }

}
