package gomes.filipe.desafiospring.entity;

public class Professor {

    private String primeiroNome;
    private String segundoNome;
    private String senha;

    public Professor(String primeiroNome, String segundoNome, String senha) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.senha = senha;
    }

    public Professor() {

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
