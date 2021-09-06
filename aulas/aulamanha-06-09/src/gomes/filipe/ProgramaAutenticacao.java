package gomes.filipe;

import gomes.filipe.model.Cliente;
import gomes.filipe.model.Desenvolvedor;

public class ProgramaAutenticacao {

    public static void main(String[] args) {

        Desenvolvedor filipe = new Desenvolvedor("Filipe", 30, 'M',20000, "filipe@test.com");
        Cliente cliente = new Cliente("cliente@test.com", "12345");

        boolean autenticacaoTrueFilipe = filipe.autentica("filipe@test.com", filipe.getSenha());
        boolean autenticacaoTrueCliente = cliente.autentica("cliente@test.com", "12345");

        System.out.println("--- Testando autenticacao true ---");
        System.out.println("autenticacao Filipe: " + autenticacaoTrueFilipe);
        System.out.println("autenticacao Cliente: " + autenticacaoTrueCliente);

        boolean autenticacaoFalseFilipe = filipe.autentica("felipe@test.com", filipe.getSenha());
        boolean autenticacaoFalseCliente = cliente.autentica("cliente@test.com", "123456");

        System.out.println("\n--- Testando autenticacao false ---");
        System.out.println("autenticacao Filipe: " + autenticacaoFalseFilipe);
        System.out.println("autenticacao Cliente: " + autenticacaoFalseCliente);
    }
}
