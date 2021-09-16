package gomes.filipe.aula6.exercicio.excecoes;

public class ClienteExistenteException extends RuntimeException {

    //private static final long serialVersionUID = 2872290168420801305L;

    public ClienteExistenteException(String mensagem) {
        super(mensagem);
    }

    public ClienteExistenteException(RuntimeException e) {
        super(e);
    }
}
