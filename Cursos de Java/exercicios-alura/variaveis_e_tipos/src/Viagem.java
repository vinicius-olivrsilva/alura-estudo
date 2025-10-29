public class Viagem {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        String mensagem;
        if (distanciaViagem > autonomiaAtual) {
            mensagem = "Você não conseguirá completar a viagem, vai precisar abastecer.";
        } else {
            mensagem = "Você conseguirá completar a viagem sem precisar abastecer.";
        }

        System.out.printf("""
        Autonomia máxima do veículo: %.1f km
        Autonomia atual: %.1f km
        %s.\s
        """, autonomiaMaxima, autonomiaAtual, mensagem);
    }
}
