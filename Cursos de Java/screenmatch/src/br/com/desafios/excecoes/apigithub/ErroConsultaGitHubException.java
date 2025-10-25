package br.com.desafios.excecoes.apigithub;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String message) {
        super(message);
    }
}
