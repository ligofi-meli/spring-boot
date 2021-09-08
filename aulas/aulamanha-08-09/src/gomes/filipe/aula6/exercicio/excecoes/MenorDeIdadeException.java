package gomes.filipe.aula6.exercicio.excecoes;

public class MenorDeIdadeException extends RuntimeException{

    private static final long serialVersionUID = 6900152881870689851L;

    public MenorDeIdadeException(String mensagem) {
        super(mensagem);
    }
}
