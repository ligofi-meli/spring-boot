package gomes.filipe.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Vendedor extends Funcionario{

    private double faturamento;
    private static final Locale localeBrasil = new Locale("pt", "BR");

    public Vendedor(String nome, int idade, char sexo, double salario , double faturamento) {
        super(nome, idade, sexo, salario);
        this.faturamento = faturamento;
    }

    public double getComissao() {
        return faturamento * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() + " " + getSalario() + " " + getComissao();
    }

    public void imprimeVendedor() {
        System.out.println("\n--- Vendedor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrasil).format(getSalario()));
        System.out.println("Comissão: " + NumberFormat.getCurrencyInstance(localeBrasil).format(getComissao()));
    }
}
