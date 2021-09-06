package gomes.filipe.model;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Desenvolvedor extends Funcionario{

    private final String senha = geradorDeSenha("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%ˆˆ*()", 28);
    private static final Locale localeBrasil = new Locale("pt", "BR");

    private final DadosAutenticacao dadosAutenticacao;

    public Desenvolvedor(String nome, int idade, char sexo, double salario, String login) {
        super(nome, idade, sexo, salario);
        dadosAutenticacao = new DadosAutenticacao(login, this.senha);
    }

    public static String geradorDeSenha(String chars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }

    public String getSenha() {
        return senha;
    }

    public double getGratificacao() {
        return super.getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getGratificacao() + " " + senha;
    }

    public boolean autentica(String login, String senha) {
        if (login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha()))
            return true;
        else return false;
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
