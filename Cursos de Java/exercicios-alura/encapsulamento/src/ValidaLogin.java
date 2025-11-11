public class ValidaLogin {
    private final String login;
    private final String senha;

    public ValidaLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean login(String login, String senha) {
        return validarLogin(login) && validarSenha(senha);
    }

    public boolean validarLogin(String tentativaLogin) {
        return tentativaLogin.equals(login);
    }

    public boolean validarSenha(String tentativaSenha) {
        return tentativaSenha.equals(senha);
    }
}
