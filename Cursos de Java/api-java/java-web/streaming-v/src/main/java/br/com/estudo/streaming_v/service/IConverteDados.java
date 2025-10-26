package br.com.estudo.streaming_v.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // estudar Generics
}
