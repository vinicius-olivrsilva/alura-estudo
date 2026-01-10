package listaligada;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Vinicius");
        System.out.println(lista);
        lista.adicionaNoComeco("Oliveira");
        System.out.println(lista);
        lista.adicionaNoComeco("Silva");
        System.out.println(lista);

        lista.adiciona("Jeangela");
        System.out.println(lista);

        lista.adiciona(2, "Bruna");
        System.out.println(lista);

        Object x = lista.pega(3);
        System.out.println(x);

        System.out.println(lista.tamanho());


    }
}
