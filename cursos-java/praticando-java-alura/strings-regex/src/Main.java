import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(" # Removendo espaços em branco");
        String nome = "      Vinicius Oliveira ";
        String nomeSemEspaco = nome.trim();
        System.out.println(nomeSemEspaco);


        System.out.println("\n # Convertendo para maiúsculas e minúsculas");
        String titulo = "Apraticando java: string e regex";
        String descricao = "Estudo na plataforma da alura com a professora jaqueline.";

        System.out.println("Texto em maiúsculas: "+titulo.toUpperCase());
        System.out.println("Texto em minúsculas: "+descricao.toLowerCase());

        System.out.println("\n # Substituindo parte de uma String");
        String texto2 = "O gato caça o rato.";
        String palavra2 = "gato";
        String palavra3 = "cachorro";

        String modificado = texto2.replace(palavra2, palavra3);

        if (!texto2.contains(palavra2)) {
            System.out.println("a palavra não foi encontrada");
        } else {
            System.out.println(modificado);
        }


        System.out.println("\n # Extraindo parte de uma string");
        String nomeArquivoCom = "relatorio_final.pdf";
        String nomeArquivoSem = nomeArquivoCom.substring(0, nomeArquivoCom.length()-4);
        System.out.println(nomeArquivoSem);

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(nomeArquivoCom);
        if (matcher.find()) {
            System.out.println("Testando regex:");
            System.out.println(matcher.group());
        }


        System.out.println("\n # Verificando se uma String contém uma Substring\n");
        String texto3 = "O gato caça o rato.";
        String palavra4 = "gato";
        if (texto3.contains(palavra4)) {
            System.out.println("A palavra "+ palavra4 +" está presente no texto.");
        } else {
            System.out.println("NÃO");
        }


        System.out.println("\n # Formatando números");
        double valor = 19.9876;
        DecimalFormat df = new DecimalFormat("0.00");
        String valorFormatado = df.format(valor);
        System.out.println("Valor formatado: " + valorFormatado);


        System.out.println("\n # Validando códigos de referência");
        String codigo = "ABC-1234";
        Pattern pattern2 = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher2 = pattern2.matcher(codigo);

        if (matcher2.find()) {
            System.out.println(matcher2.group());
            System.out.println("Código válido!");
        } else {
            System.out.println("Código inválido!");
        }

        System.out.println("\n # Validando senhas com Regex");
    }
}
