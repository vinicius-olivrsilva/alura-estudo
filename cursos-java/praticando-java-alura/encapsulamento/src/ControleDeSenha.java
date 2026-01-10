public class ControleDeSenha {
    private String senha;

    public ControleDeSenha(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if (senha.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
