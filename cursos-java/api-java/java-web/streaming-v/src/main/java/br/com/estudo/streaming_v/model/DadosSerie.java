package br.com.estudo.streaming_v.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie (@JsonAlias({"Title", "titulo","title"}) String titulo,
                          @JsonAlias("totalSeasons") Integer totalTemporadas,
                          @JsonAlias("imdbRating") String avaliacao) {
}
