package com.alura.pratica.praticandocursos.lambdasstreamsspring.capituloum.service;

public interface IConverteJson {
    <T> T obterDados(String json, Class<T> classe);

    // Teste Vinicius
}
