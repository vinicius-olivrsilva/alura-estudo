public class SomaPares {
    public static void main(String[] args) {
        final int numMax = 100;
        int total = 0;

        for (int i = 0; i <= numMax; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + total);
    }
}
