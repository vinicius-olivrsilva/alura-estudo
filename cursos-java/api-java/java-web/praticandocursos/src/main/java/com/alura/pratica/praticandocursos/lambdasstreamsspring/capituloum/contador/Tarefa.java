package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloum.contador;

import com.fasterxml.jackson.annotation.JsonAlias;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class Tarefa {
    @JsonAlias("descricao")
    private String descricao;
    @JsonAlias("concluida")
    private boolean concluida;
    @JsonAlias("pessoaResponsavel")
    private String pessoaResponsavel;

    public Tarefa() {
    }

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "########## Tarefa Method…" +
                "Descricao: " + descricao + '\'' +
                ", Concluida: " + concluida +
                ", PessoaResponsavel: " + pessoaResponsavel + '\'' +
                '}';
    }
}
