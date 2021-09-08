package gomes.filipe.aula6.exercicio.excecoes;

public class ClienteExistenteException extends RuntimeException {

    private static final long serialVersionUID = 7777200004643321332L;

    public ClienteExistenteException(String mensagem) {
        super(mensagem);
    }
}
