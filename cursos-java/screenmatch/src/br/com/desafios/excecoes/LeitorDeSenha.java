package br.com.desafios.excecoes;

import java.util.Objects;
import java.util.Scanner;

public class LeitorDeSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = input.nextLine();

        try {
            validarSenha(senha);
            System.out.println("LOGOU");

        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarSenha(String senha) {
        int qtdCaracteres = senha.length();
        if (qtdCaracteres != 5) {
            throw new SenhaInvalidaException("A senha deve ter 5 caracteres");
        }
        if (!senha.equals("12345")) {
            throw new SenhaInvalidaException("A senha está incorreta");
        }
    }
}
