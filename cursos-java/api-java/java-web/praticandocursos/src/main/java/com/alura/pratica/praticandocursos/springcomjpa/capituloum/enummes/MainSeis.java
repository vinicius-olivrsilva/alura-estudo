package com.alura.pratica.praticandocursos.springcomjpa.capituloum.enummes;

/***
 * Crie um enum Mes que represente os meses do ano. Adicione um metodo que retorna o número de dias de cada mês,
 * considerando anos não bissextos.
 */

public class MainSeis {
    public static void principal(){
        System.out.println(Mes.FEVEREIRO.getNumeroDeDias()); // 28
        System.out.println(Mes.JULHO.getNumeroDeDias()); // 31
    }
}
