package criandomapa;

public class Client {
    private final String nome;

    public Client(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
