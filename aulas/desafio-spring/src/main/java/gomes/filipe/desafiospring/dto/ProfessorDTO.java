package gomes.filipe.desafiospring.dto;

public class ProfessorDTO {

    private String primeiroNome;
    private String segundoNome;

    public ProfessorDTO() {

    }

    public ProfessorDTO(String primeiroNome, String segundoNome) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }
}
