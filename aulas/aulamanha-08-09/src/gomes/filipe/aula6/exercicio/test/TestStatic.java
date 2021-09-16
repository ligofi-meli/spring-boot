package gomes.filipe.aula6.exercicio.test;

import gomes.filipe.aula6.exercicio.model.Cliente;
import gomes.filipe.aula6.exercicio.service.ClienteService;

import java.time.LocalDate;
import java.util.List;

public class TestStatic {

    public static void main(String[] args) {
        ClienteService service1 = new ClienteService();

        service1.adiciona(new Cliente("Ana", LocalDate.parse("1991-01-01")));
        service1.adiciona(new Cliente("Joana", LocalDate.parse("1991-02-02")));
        service1.adiciona(new Cliente("Mariana", LocalDate.parse("1991-03-03")));


        ClienteService service2 = new ClienteService();
        List<Cliente> listagem = service2.listagem();

        for (Cliente cliente : listagem) {
            System.out.println(cliente.getNome());
        }

        System.out.println("Programa finalizado");
    }
}
