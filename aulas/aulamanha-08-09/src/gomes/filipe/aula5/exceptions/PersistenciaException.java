package gomes.filipe.aula5.exceptions;

public class PersistenciaException extends RuntimeException{

    public PersistenciaException(String mensagem) {
        super(mensagem);
    }
}
