package br.com.desafios.cap1.abastracao;

import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = LocalDate.now().getYear();

    public String toString() {
        return "Carro{modelo='" + this.modelo + "', ano=" + this.ano + ", cor='" + this.cor + "'}";
    }

    void idadeDoCarro() {
        int idadeCarro = this.anoAtual - this.ano;
        System.out.println("O " + this.modelo + " tem " + idadeCarro + " anos");
    }
}

