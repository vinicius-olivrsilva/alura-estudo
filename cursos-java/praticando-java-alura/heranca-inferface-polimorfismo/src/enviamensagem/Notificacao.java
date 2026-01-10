package enviamensagem;

public class Notificacao {
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String contato, String mensagem) {
        System.out.printf("Mensagem para %s: %s\n", contato, mensagem);
    }

    public void enviarMensagem(String contato, String mensagem, int nVezes) {
        for (int i = 0; i < nVezes; i++) {
            System.out.printf("Mensagem para %s: %s\n", contato, mensagem);
        }
    }
}
