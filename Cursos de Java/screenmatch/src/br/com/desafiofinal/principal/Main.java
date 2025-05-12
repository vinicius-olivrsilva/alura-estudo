package br.com.desafiofinal.principal;

import br.com.desafiofinal.modelos.MinhasPreferidas;
import br.com.desafiofinal.modelos.Musica;
import br.com.desafiofinal.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Nobody");
        musica1.setArtista("OneRepublic");
        musica1.setAlbum("Artificial Paradise");

        Musica musica2 = new Musica();
        musica2.setTitulo("No Meu Coração Você Vai Sempre Estar");
        musica2.setArtista("Ed Motta");
        musica2.setAlbum("Artificial Paradise");

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Podcast Pesquisa Científica");
        podcast1.setHost("Vinícius Oliveira");
        podcast1.setDescricao("História do Ciêntista que busca seu sonho");

        // reprodução e curtidas
        MinhasPreferidas gerador = new MinhasPreferidas();
        int reprodAleatorio = gerador.geraCurtRepro(0, 500);
        for (int i = 0; i < reprodAleatorio; i++) {
            musica1.reproduzir();
        }
        int curtidaAleatoria = gerador.geraCurtRepro(0, reprodAleatorio);
        for (int i = 0; i < curtidaAleatoria; i++) {
            musica1.curtir();
        }
        int totalNota = 0;
        for (int i = 0; i < 10; i++) {
            int nota = gerador.geraCurtRepro(5, 11);
            totalNota += nota;
            System.out.println("TOTAL ATUAL: " + totalNota + " nota dada: + " + nota);
        }
        musica1.votaImdb(totalNota);

        // Segunda
        reprodAleatorio = gerador.geraCurtRepro(0, 500);
        for (int i = 0; i < reprodAleatorio; i++) {
            musica2.reproduzir();
        }
        curtidaAleatoria = gerador.geraCurtRepro(0, reprodAleatorio);
        for (int i = 0; i < curtidaAleatoria; i++) {
            musica2.curtir();
        }
        totalNota = 0;
        for (int i = 0; i < 10; i++) {
            int nota = gerador.geraCurtRepro(0, 11);
            totalNota += nota;
        }
        musica2.votaImdb(totalNota);

        // Terceira
        reprodAleatorio = gerador.geraCurtRepro(0, 500);
        for (int i = 0; i < reprodAleatorio; i++) {
            podcast1.reproduzir();
        }
        curtidaAleatoria = gerador.geraCurtRepro(0, reprodAleatorio);
        for (int i = 0; i < curtidaAleatoria; i++) {
            podcast1.curtir();
        }
        totalNota = 0;
        for (int i = 0; i < 10; i++) {
            int nota = gerador.geraCurtRepro(7, 11);
            totalNota += nota;
        }
        podcast1.votaImdb(totalNota);

        musica1.exibeStatus();
        musica2.exibeStatus();
        podcast1.exibeStatus();
    }
}
