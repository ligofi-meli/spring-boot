package gomes.filipe.aula6.exercicio.excecoes;

public class MenorDeIdadeException extends RuntimeException{

    private static final long serialVersionUID = 6661906084514107071L;

    public MenorDeIdadeException(String mensagem) {
        super(mensagem);
    }

    public MenorDeIdadeException(RuntimeException e) {
        super(e);
    }
}
