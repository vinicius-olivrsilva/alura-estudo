package br.com.estudo.streaming_v.service;

import br.com.estudo.streaming_v.model.DadosSerie;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    ObjectMapper mapper = new ObjectMapper();

    // recebe uma json/string e transforma na classe que foi indicada
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe); // Lê o json que recebi e tenta transformar na classe passada
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}
