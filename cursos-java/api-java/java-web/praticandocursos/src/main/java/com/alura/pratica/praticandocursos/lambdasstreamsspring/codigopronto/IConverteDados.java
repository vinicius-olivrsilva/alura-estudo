package com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto;

public interface IConverteDados {
    String serializador(Object objeto);
    <T> T desserializador(String json, Class<T> classe);
}
