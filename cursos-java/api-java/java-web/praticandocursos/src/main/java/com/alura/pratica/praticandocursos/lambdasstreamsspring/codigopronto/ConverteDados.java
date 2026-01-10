package com.alura.pratica.praticandocursos.lambdasstreamsspring.codigopronto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ConverteDados implements IConverteDados {
    private final ObjectMapper mapper;

    public ConverteDados() {
        this.mapper = new ObjectMapper();
        this.mapper.enable(SerializationFeature.INDENT_OUTPUT); // formata o JSON para sair bonito
    }

    @Override
    public String serializador(Object object) { // TRANSFORMAR OBJETO ---> JSON
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T desserializador(String json, Class<T> classe) { // TRANSFORMAR JSON/STRING ----> OBJETO
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
