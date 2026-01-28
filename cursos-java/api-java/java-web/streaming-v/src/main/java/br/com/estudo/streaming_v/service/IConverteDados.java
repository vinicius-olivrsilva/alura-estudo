package br.com.estudo.streaming_v.service;

public interface IConverteDados {
    // Não sei qual dado vai ser retornado então retorno um "generics"
    <T> T obterDados(String json, Class<T> classe);
}
