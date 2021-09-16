package gomes.filipe.exercicio1;

import gomes.filipe.exercicio1.domain.Agenda;
import gomes.filipe.exercicio1.domain.Pessoa;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenarPessoa(new Pessoa("Maria Flor", "Avenidas das flores, nº 4000", "01 0000-0022", 68, 1.61));
        agenda.armazenarPessoa(new Pessoa("Morais Vieria", "Parque industrial, nº 21 apt 322", "01 0000-0044", 39, 1.90));
        agenda.armazenarPessoa(new Pessoa("Celine Pasteur", "Avenida das Nacoes, nº 88 apt 811 ", "01 0000-0098", 23, 1.70));
        agenda.armazenarPessoa(new Pessoa("Roberto Carlos", "Condominio dos atletas, casa 8", "01 0000-0077", 44, 1.68));
        agenda.armazenarPessoa(new Pessoa("Florencia Albenez", "Rua cerro portenho, casa 11", "01 0000-0032", 32, 1.63));
        agenda.armazenarPessoa(new Pessoa("Bjorn Amara", "Rua rei dos Suíones, castelode pedras", "01 0000-0004", 100, 1.88));
        agenda.armazenarPessoa(new Pessoa("Anie Jackson", "Cidade universitária, dormitório A1 apt 9", "01 0000-0307", 19, 1.65));
        agenda.armazenarPessoa(new Pessoa("Franklin Benjamin", "Cidade universitária, dormitório C2 apt 4", "01 0000-520", 21, 1.82));
        agenda.armazenarPessoa(new Pessoa("Simone Pasquali", "Rua das massas, nº 65 Restaurante La I'italiana ", "01 0000-998", 54, 1.71));
        agenda.armazenarPessoa(new Pessoa("José Silva", "Chácara do Zé, nº 12", "01 0000-212", 61, 1.84));

        agenda.removerPessoa("Morais Vieria");
        agenda.buscarPessoa("Anie Jackson");
        agenda.exibirTodaAgenda();
        agenda.exibirPessoa(2);
        agenda.listarPessoasEmOrdemAlfabeticaDeNome();
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();
        agenda.listarPessoasPorIdade();
    }
}
