package gomes.filipe.domain;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Desenvolvedor extends Funcionario{
    private String senha = geradorDeSenha("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%ˆˆ*()", 28);
    private static final Locale localeBrasil = new Locale("pt", "BR");

    public Desenvolvedor(String nome, int idade, char sexo, double salario) {
        super(nome, idade, sexo, salario);
        this.senha = senha;
    }

    public static String geradorDeSenha(String chars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }

    public double getGratificacao() {
        return super.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getGratificacao() + " " + senha;
    }

    public void imprimeDesenvolvedor() {
        System.out.println("\n--- Desenvolvedor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrasil).format(getSalario()));
        System.out.println("Senha: " + senha);
    }
}
