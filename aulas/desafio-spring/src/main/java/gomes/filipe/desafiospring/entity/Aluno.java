package gomes.filipe.desafiospring.entity;

import java.util.List;

public class Aluno {

    private String nome;
    private String endereco;
    private int idade;
    private List<Disciplina> disciplinasConcluidas;

    public Aluno(String nome, String endereco, int idade, List<Disciplina> disciplinasConcluidas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Disciplina> getDisciplinasConcluidas() {
        return disciplinasConcluidas;
    }

    public void setDisciplinasConcluidas(List<Disciplina> disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
    }
}
