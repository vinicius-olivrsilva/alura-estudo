package br.com.desafios.listaecolecoes.cap4.comparablecomparator;

import java.util.ArrayList;
import java.util.List;

public class TituloDesafio implements Comparable<TituloDesafio>{
    private String nome;

    public TituloDesafio(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(TituloDesafio outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
