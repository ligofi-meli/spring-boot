package gomes.filipe.desafiospring.entity;

public class Disciplina {

    private String nomeDisciplina;
    private Double nota;

    public Disciplina(String nomeDisciplina, Double nota) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
