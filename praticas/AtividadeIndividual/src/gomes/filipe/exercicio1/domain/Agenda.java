package gomes.filipe.exercicio1.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {

    List<Pessoa> pessoas = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                pessoas.remove(pessoas.get(i));
            }
        }
        System.out.println("\nPessoa removida: " + nome);
    }

    public void buscarPessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome)) {
                pessoas.get(i);
            }
        }
        System.out.println("\nPessoa localizada: " + nome);
    }

    public void exibirTodaAgenda() {
        System.out.println("\n--- AGENDA ---");
        pessoas.forEach(System.out::println);
    }

    public void exibirPessoa(int index) {
        System.out.println("\n--- Exibindo pessoa pelo index ---");
        System.out.println("Index : " + index + " Pessoa: " + pessoas.get(index));
    }

    public void listarPessoasEmOrdemAlfabeticaDeNome() {
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        });
        System.out.println("\n--- Lista de pessoas por ordem alfabética de nome crescente ---");
        pessoas.forEach(System.out::println);
    }

    public void listarPessoasEmOrdemAlfabeticaDeEndereco() {
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getEndereco().compareTo(p2.getEndereco());
            }
        });
        System.out.println("\n--- Lista de pessoas por ordem alfabética de endereco crescente ---");
        pessoas.forEach(System.out::println);
    }

    public void listarPessoasPorIdade() {
        pessoas.sort(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p2.getIdade().compareTo(p1.getIdade());
            }
        });
        System.out.println("\n--- Lista de pessoas por ordem idade decrescente ---");
        pessoas.forEach(System.out::println);
    }
}
