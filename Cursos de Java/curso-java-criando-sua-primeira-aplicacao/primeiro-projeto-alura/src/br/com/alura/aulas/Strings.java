package br.com.alura.aulas;

public class Strings {
    public static void main(String[] args) {
        System.out.println(" ##### COMPARANDO STRINGS ###### ");
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = "Vinícius";

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
        System.out.println(nome1.equals(nome3));
        System.out.println(nome1.equalsIgnoreCase(nome3));

        System.out.println(" ##### MÉTODO format() ###### ");
        String nome = "Oliveira";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String nome4 = "Vinicius Oliveira";
        int aulas = 4;

        String mensagem = """
                  
                  Text Block com formatted
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome4, aulas);

        System.out.println(mensagem);
    }
}