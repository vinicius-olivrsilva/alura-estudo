package br.com.screenmatch.modelos;

import br.com.screenmatch.exception.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
//     @SerializedName("Title")
    private String nome;
//    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Ano não convertido pois tem mais de 4 caracteres.");
        }
        // Aula Alura
//        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
//        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));

        this.anoDeLancamento = validadaNumeros(meuTituloOmdb.year());
        this.duracaoEmMinutos = validadaNumeros(meuTituloOmdb.runtime());
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(Titulo: " + nome +
                ", Ano de Lançamento: " + anoDeLancamento +
                ", Duração: " + duracaoEmMinutos + " minutos)";
    }

    public int validadaNumeros(String entrada) {
        String apenasNumeros = entrada.replaceAll("[^0-9]", "");
        if (apenasNumeros.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(apenasNumeros);
    }
}
