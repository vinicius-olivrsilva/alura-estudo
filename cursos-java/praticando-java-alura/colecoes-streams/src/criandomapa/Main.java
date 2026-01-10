package criandomapa;

public class Main {
    public static void main(String[] args) {
        ClientList clientes = new ClientList();
        clientes.adicionarCliente(1L, new Client("Vinicius Oliveira"));
        clientes.adicionarCliente(2L, new Client("Marcos"));
        clientes.adicionarCliente(3L, new Client("Jão da Silva"));

        System.out.println(clientes.getClient());
        Long id = 2L;
        Client client = clientes.buscarClientePorId(id);
        System.out.printf("O nome do cliente com ID %d é: %s", id, client);
    }
}
