package br.com.desafios.listaecolecoes.cap4.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        System.out.println("----- Desafio 1 -----");
        Desafio1 listaComSort = new Desafio1();
        listaComSort.organizaImprime();

        System.out.println("----- Desafio 2 e 3-----");

        List<TituloDesafio> listaTituloDesafio = new ArrayList<>();
        listaTituloDesafio.add(new TituloDesafio("Branca de Neve"));
        listaTituloDesafio.add(new TituloDesafio("Cinderela"));
        listaTituloDesafio.add(new TituloDesafio("Bela Adormecida"));
        listaTituloDesafio.add(new TituloDesafio("Rapunzel"));

        Collections.sort(listaTituloDesafio);
        System.out.println(listaTituloDesafio);

        System.out.println("----- Desafio 4-----");
        List<String> listaTrocada = new LinkedList<>();
        listaTrocada.add("Vinicius");
        System.out.println(listaTrocada);

        System.out.println("----- Desafio 5-----");
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
