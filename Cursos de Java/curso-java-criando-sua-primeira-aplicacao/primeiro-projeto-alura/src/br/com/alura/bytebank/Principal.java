package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Bytebank");
        Funcionario vinicius = new Funcionario("Vinícius", 1, LocalDate.of(1995, 3, 27));
        System.out.println(vinicius);
    }
}
