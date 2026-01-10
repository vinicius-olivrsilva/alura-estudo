package br.com.desafiofinal.modelos;

import br.com.desafiofinal.principal.Audio;

public class Musica extends Audio {
    private String album;
    private String artista;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void exibeStatus() {
        super.exibeStatus();
        String imprimePodcast = """ 
                Astista: %s
                Albúm: %s
                *********************
                """.formatted(this.getArtista(), this.getAlbum());
        System.out.println(imprimePodcast);
    }
}
