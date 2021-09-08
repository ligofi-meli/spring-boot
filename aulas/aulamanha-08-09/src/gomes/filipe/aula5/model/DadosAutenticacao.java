package gomes.filipe.aula5.model;

public class DadosAutenticacao {

    private final String login;
    private final String senha;

    public DadosAutenticacao(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
