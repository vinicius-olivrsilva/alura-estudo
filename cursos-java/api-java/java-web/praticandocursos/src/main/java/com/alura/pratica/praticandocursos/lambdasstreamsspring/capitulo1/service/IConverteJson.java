package com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo1.service;

public interface IConverteJson {
    <T> T obterDados(String json, Class<T> classe);

    // Teste Vinicius
}
