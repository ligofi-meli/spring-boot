package gomes.filipe.aula5;

import gomes.filipe.aula5.model.Cliente;
import gomes.filipe.aula5.model.Desenvolvedor;
import gomes.filipe.aula5.util.ArquivoUtil;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Desenvolvedor filipe = new Desenvolvedor("Filipe", 30, 'M',100_000, "filipe@test.com");
        Cliente cliente = new Cliente("cliente@test.com", "12345");

        filipe.imprimeDesenvolvedor();

        ArquivoUtil arquivoUtil = new ArquivoUtil();
        arquivoUtil.escreveObjetoArquivoTexto(filipe);
        arquivoUtil.fechaArquivo();

        System.out.println();

        filipe.autencica("filipe@test.com", filipe.getSenha());
        cliente.autencica("cliente@test.com", "12345");

        // senha errada
        filipe.autencica("filipe@test.com", "ab123tr56Z");
        // login errado
        cliente.autencica("client@test.com", "12345");
    }
}
