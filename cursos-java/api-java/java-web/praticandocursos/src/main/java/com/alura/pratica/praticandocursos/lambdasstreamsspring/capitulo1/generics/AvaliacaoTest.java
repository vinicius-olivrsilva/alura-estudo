package com.alura.pratica.praticandocursos.lambdasstreamsspring.capitulo1.generics;

public class AvaliacaoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Smartphone Galaxy A54", 2000.00);
        Servico s = new Servico("Instalação de TV", 120.00);
        Assinatura a = new Assinatura("Streaming Plus", 29.90, 12);

        Avaliacao<Produto> avProd = new Avaliacao<>(p, 4.5, "Ótimo aparelho");
        Avaliacao<Servico> avServ = new Avaliacao<>(s, 5.0, "instalaçao rápida");
        Avaliacao<Assinatura> avAssin = new Avaliacao<>(a, 3.8, "Bom conteúdo");

        // Usando métodos
        System.out.println(avProd);
        System.out.println(avServ);
        System.out.println(avAssin);

        // Exemplo de método que aceita qualquer avaliação (curinga)
        imprimirAvaliacao(avProd);
        imprimirAvaliacao(avServ);
        imprimirAvaliacao(avAssin);

        // Tentar criar avaliação inválida (descomente para ver exceção)
        // Avaliacao<Produto> avRuim = new Avaliacao<>(p, 6.0, "Nota inválida - deve lançar erro.");
    }

    public static void imprimirAvaliacao(Avaliacao<?> avaliacao) {
        System.out.println("Imprimindo via método genérico: " + avaliacao.getComentario()
                + " (nota: " + avaliacao.getNota() + ")");
    }
}
