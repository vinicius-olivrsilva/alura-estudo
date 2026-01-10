public class CorrigeCadastro {
    private String nome;
    private String cargo;
    private String nivelAcesso;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    private void exibeDados() {
        System.out.printf("""              
                Nome: %s
                Cargo: %s
                Nível de acesso: %s
                """, nome, cargo, nivelAcesso);
    }

    public void atualizaDados(String novoCargo, String novoNivelAcesso) {
        System.out.println("--- Antes da atualização ---");
        exibeDados();

        this.cargo = novoCargo;
        this.nivelAcesso = novoNivelAcesso;

        System.out.println("--- Após atualização ---");
        exibeDados();
    }
}
