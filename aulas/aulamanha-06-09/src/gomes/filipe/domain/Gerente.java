package gomes.filipe.domain;

import java.text.NumberFormat;
import java.util.Locale;

public class Gerente extends Funcionario {
    private static final Locale localeBrasil = new Locale("pt", "BR");

    public Gerente(String nome, int idade, char sexo, double salario) {
        super(nome, idade, sexo, salario);
    }

    public double getGratificacao() {
        return super.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getGratificacao();
    }

    public void imprimeGerente() {
        System.out.println("\n--- Gerente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrasil).format(getSalario()));
        System.out.println("Comissão: " + NumberFormat.getCurrencyInstance(localeBrasil).format(getGratificacao()));
    }
}
