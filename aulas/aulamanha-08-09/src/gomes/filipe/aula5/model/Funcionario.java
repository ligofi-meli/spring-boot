package gomes.filipe.aula5.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    private String nome;
    private int idade;
    private char sexo;
    private double salario;

    private static final Locale localeBrasil = new Locale("pt", "BR");

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, char sexo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome=' " + nome + '\'' +
                ", Idade= " + idade +
                ", Sexo=' " + sexo + '\'' +
                ", Salário=' " + salario + '\'' +
                '}';
    }

    public void imprimeFuncionario() {
        System.out.println("\n--- Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrasil).format(salario));
    }
}
