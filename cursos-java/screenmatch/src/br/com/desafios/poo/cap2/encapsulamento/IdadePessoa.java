package br.com.desafios.poo.cap2.encapsulamento;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void verificarIdade() {
        if (this.getIdade() >= 1 && this.getIdade() <= 120) {
            if (this.getIdade() >= 18) {
                System.out.println(this.idade + " MAIOR DE IDADE");
            } else {
                System.out.println(this.idade + " Menor de idade");
            }

        } else {
            System.out.println(this.idade + " Idade Inválida");
        }
    }
}
