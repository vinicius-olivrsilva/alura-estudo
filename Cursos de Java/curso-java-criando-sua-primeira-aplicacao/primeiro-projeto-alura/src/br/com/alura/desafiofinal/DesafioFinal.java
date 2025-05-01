package br.com.alura.desafiofinal;

public class DesafioFinal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Cliente cliente = new Cliente();

        cliente.setNome("Vinícius Oliveira");
        cliente.setSaldo(3900.00);
        cliente.imprimeDadosCliente();

        menu.menu(cliente);
    }
}
