package gomes.filipe.aula5.model;


import gomes.filipe.aula5.entity.UsuarioAutenticavel;
import gomes.filipe.aula5.exceptions.LoginException;

public class Cliente implements UsuarioAutenticavel {

    private final DadosAutenticacao dadosAutenticacao;

    public Cliente(String login, String senha) {
        dadosAutenticacao = new DadosAutenticacao(login, senha);
    }

    @Override
    public boolean autencica(String login, String senha) {
        if (login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha())){
            System.out.println("Usuário logado");
        } else {
            throw new LoginException("Erro no login");
        }
        return false;
    }
}
