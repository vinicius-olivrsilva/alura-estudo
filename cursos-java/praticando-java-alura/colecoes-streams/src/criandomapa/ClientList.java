package criandomapa;

import java.util.HashMap;
import java.util.Map;

public class ClientList {
    private final Map<Long, Client> clientMap;

    public ClientList() {
        this.clientMap = new HashMap<>();
    }

    public void adicionarCliente(Long id, Client cliente) {
        clientMap.put(id, cliente);
    }

    public Map<Long, Client> getClient() {
        return Map.copyOf(clientMap);
    }

    public Client buscarClientePorId(Long id) {
        return clientMap.get(id);
    }
}
