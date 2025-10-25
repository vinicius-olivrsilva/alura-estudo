package br.com.desafios.persistearquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DesafioUm {
    public static void main(String[] args) {
        final Logger LOGGER = Logger.getLogger(DesafioUm.class.getName());

        try {
            FileWriter file = new FileWriter("src/br/com/desafios/persistearquivos/arquivo.txt");
            file.write("Conteúdo a ser gravado no arquivo");
            file.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao escrever no arquivo", e);
        }
    }
}
