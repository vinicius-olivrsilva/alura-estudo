public class ConversorMoeda {
    public static void main(String[] args) {
        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolar = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: US$ "+ valorDolar);
    }
}
