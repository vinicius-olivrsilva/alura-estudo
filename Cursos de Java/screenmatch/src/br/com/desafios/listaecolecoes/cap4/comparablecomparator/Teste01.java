package br.com.desafios.listaecolecoes.cap4.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Teste01 {
    public static void main(String[] args) {
        Teste conta1 = new Teste(400);
        Teste conta2 = new Teste(250);
        Teste conta3 = new Teste(300);
        Teste conta4 = new Teste(275);
        Teste conta5 = new Teste(200);

        ArrayList<Teste> saldos = new ArrayList<>();
        saldos.add(conta1);
        saldos.add(conta2);
        saldos.add(conta3);
        saldos.add(conta4);
        saldos.add(conta5);

        Collections.sort(saldos);
        System.out.println("Saldos ordenados: (Ordem Decrescecnte)");
        System.out.println(saldos);

    }
}
