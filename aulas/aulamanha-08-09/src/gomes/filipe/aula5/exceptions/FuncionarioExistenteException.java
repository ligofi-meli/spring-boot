package gomes.filipe.aula5.exceptions;

public class FuncionarioExistenteException extends RuntimeException{

    public FuncionarioExistenteException(String mensagem) {
        super(mensagem);
    }

    public FuncionarioExistenteException(RuntimeException e) {
        super(e);
    }
}
