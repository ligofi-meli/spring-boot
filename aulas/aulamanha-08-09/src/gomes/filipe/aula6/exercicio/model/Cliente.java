package gomes.filipe.aula6.exercicio.model;

import java.time.LocalDate;

public class Cliente {

    private final String nome;
    private final LocalDate dataNascimento;

    public Cliente(String nome, LocalDate dataNascimento) {
        super();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
