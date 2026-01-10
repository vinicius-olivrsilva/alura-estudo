package verificachave;

import java.util.HashMap;
import java.util.Map;

/**
 * Verificando se a chave existe
 */
public class VerificaChaveMain {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int id = 6;
        if (clientes.containsKey(id)) {
            String nomeCliente = clientes.get(id); // evitar esse get na main
            System.out.println( "O nome do cliente com ID " + id + " é: " + nomeCliente);
        } else {
            System.out.printf(" Cliente com ID %d não encontrado.", id);
        }
    }
}
