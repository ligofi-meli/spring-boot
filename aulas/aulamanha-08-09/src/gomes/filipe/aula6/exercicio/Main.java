package gomes.filipe.aula6.exercicio;

import gomes.filipe.aula6.exercicio.excecoes.ClienteExistenteException;
import gomes.filipe.aula6.exercicio.excecoes.MenorDeIdadeException;
import gomes.filipe.aula6.exercicio.model.Cliente;
import gomes.filipe.aula6.exercicio.service.ClienteService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();

        System.out.println("\n OBS: Caso queria sair do programa, digite exit no terminal a qualquer momento");

        while(true) {
            System.out.println("\nDigite o nome do cliente:");
            String nome = console.nextLine();
            System.out.println("\nDigite a data de nascimento do cliente(Ex: 1980-10-08):");
            String dataNascimento = console.nextLine();

            if (nome.equalsIgnoreCase("exit") || dataNascimento.equalsIgnoreCase("exit")){
                console.close();
                System.exit(0);
            }
            try {
                Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascimento));
                clienteService.adiciona(cliente);
                System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso\n");
            } catch (MenorDeIdadeException | ClienteExistenteException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
