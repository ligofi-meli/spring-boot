package gomes.filipe.aula5.exceptions;

public class LoginException extends RuntimeException{

    private static final long serialVersionUID = 3753795166142497778L;

    public LoginException(String mensagem) {
        super(mensagem);
    }

    public LoginException(RuntimeException e) {
        super(e);
    }

}
