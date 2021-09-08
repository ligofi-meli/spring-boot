package gomes.filipe.aula6.exercicio.service;

import gomes.filipe.aula6.exercicio.excecoes.ClienteExistenteException;
import gomes.filipe.aula6.exercicio.excecoes.MenorDeIdadeException;
import gomes.filipe.aula6.exercicio.model.Cliente;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();

    public void adiciona(Cliente cliente) throws ClienteExistenteException, MenorDeIdadeException {
        long idade = ChronoUnit.YEARS.between(cliente.getDataNascimento(), LocalDate.now());

        if (clienteCadastrado(cliente)) {
            throw new ClienteExistenteException("Cliente " + cliente.getNome() + " já cadastrado, tem " + idade + " anos");
        }
        if (!maiorDeIdade(cliente)) {
            throw new MenorDeIdadeException(
                    "Cliente " + cliente.getNome() + " é menor de idade, têm " + idade + " anos");
        }
        clientes.add(cliente);
    }

    private boolean clienteCadastrado(Cliente cliente) {
        return clientes.contains(cliente);
    }

    private boolean maiorDeIdade(Cliente cliente) {
        long idade = ChronoUnit.YEARS.between(cliente.getDataNascimento(), LocalDate.now());
        return (idade >= 18);
    }

    public List<Cliente> listagem() {
        return clientes;
    }
}
