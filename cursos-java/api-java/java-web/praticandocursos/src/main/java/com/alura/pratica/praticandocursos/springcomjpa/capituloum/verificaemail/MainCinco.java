package com.alura.pratica.praticandocursos.springcomjpa.capituloum.verificaemail;

import java.util.Arrays;
import java.util.List;

/**
 * Implemente um metodo que recebe uma lista de e-mails (String) e
 * retorna uma nova lista onde cada e-mail está convertido para letras minúsculas.
 */

public class MainCinco {
    public static void principal() {
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
        // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]
    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .toList();
    }
}
