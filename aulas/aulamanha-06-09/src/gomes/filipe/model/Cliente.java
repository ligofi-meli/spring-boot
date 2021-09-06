package gomes.filipe.model;

import gomes.filipe.entity.UsuarioAutenticavel;

public class Cliente implements UsuarioAutenticavel {

    private final DadosAutenticacao dadosAutenticacao;

    public Cliente(String login, String senha) {
        dadosAutenticacao = new DadosAutenticacao(login, senha);
    }

    public boolean autentica(String login, String senha) {
        if (login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
            return true;
        else return false;
    }

    @Override
    public boolean autencica(String login, String senha) {
        return false;
    }
}
