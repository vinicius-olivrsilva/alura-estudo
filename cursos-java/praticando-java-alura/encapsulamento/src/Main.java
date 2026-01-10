import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" # Cadastrando veículos");
        CadastraVeiculos carroGol = new CadastraVeiculos("Gol", "ABC-1234", 2020);
        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + carroGol.getModelo());
        System.out.println("Placa: " + carroGol.getPlaca());
        System.out.println("Ano: " + carroGol.getAno());


        System.out.println("\n # Cadastrando veículos");
        List<AgendaContatos> contatos = new ArrayList<>();
        contatos.add(new AgendaContatos("João Silva", "(11) 99999-0000"));
        contatos.add(new AgendaContatos("Luana Santos", "(21) 98888-0000"));
        contatos.add(new AgendaContatos("Vinicius Oliveira", "(31) 97777-0000"));

        int indice = 1;
        for (AgendaContatos contato : contatos) {
            System.out.printf("%d. %s - %s\n", indice, contato.getNome(), contato.getTelefone());
            indice++;
        }


        System.out.println("\n # Cadastro de produtos com validação");
        CadastroProdutosValidacao produto = new CadastroProdutosValidacao("Mouse", -59.90);
        produto.exibirDados();


        System.out.println("\n # Controle de senha");
        ControleDeSenha user = new ControleDeSenha("123456");
        user.setSenha("123456", "abc123");


        System.out.println("\n # Controle do nível de bateria");
        ControleNivelBateria bateria = new ControleNivelBateria();
        bateria.setNivelBateria(85);


        System.out.println("\n # Controle do nível de bateria");
        ControleSaldoBancario conta = new ControleSaldoBancario("Ana");
        conta.depositar(1000.0);
        conta.sacar(1200);
        conta.exibirSaldo();


        System.out.println("\n\n # Avaliação de filmes");
        AvaliacaoFilmes matrix = new AvaliacaoFilmes("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);
        matrix.exibeMedia();


        System.out.println("\n\n # Validação de login");
//        Scanner sc = new Scanner(System.in);
//        ValidaLogin usuarioLog = new ValidaLogin("aluno2025", "escola@123");
//
//        int tentativa = 3;
//        while (tentativa >= 1) {
//            System.out.print("Login: ");
//            String login = sc.nextLine();
//            System.out.print("Senha : ");
//            String senha = sc.nextLine();
//
//            if (usuarioLog.login(login, senha)) {
//                System.out.println("Login bem-sucedido!");
//                break;
//            }
//            tentativa--;
//            if (tentativa == 0) {
//                System.out.println("Conta Bloqueada temporariamente!!!");
//            } else {
//                System.out.println("Senha incorreta. Tentativas restantes: " + (tentativa));
//            }
//        }

        System.out.println("\n\n # Sistema de pontos para alunos");
        SistemasPontosAlunos aluno = new SistemasPontosAlunos("Vinicius");
        aluno.ganharPontos(300);
        System.out.print(aluno.exibirStatus());


        System.out.println("\n\n # Sistema de pontos para alunos");
        RegistroDeNotas matematica = new RegistroDeNotas("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);
        matematica.exibeStatus();
    }
}