package br.com.desafiofinal.modelos;

import br.com.desafiofinal.principal.Audio;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibeStatus() {
        super.exibeStatus();
        String imprimePodcast = """
                Apresentador: %s
                Descrição: %s
                *********************""".formatted(this.getHost(), this.getDescricao());
        System.out.println(imprimePodcast);
    }
}
