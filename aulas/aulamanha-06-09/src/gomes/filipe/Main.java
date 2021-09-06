package gomes.filipe;

import gomes.filipe.domain.*;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale localeBrasil = new Locale("pt", "BR");

        Funcionario anna = new Funcionario("Anna", 30, 'F',8000 );
        Gerente velasco = new Gerente("Velasco", 57, 'M', 68000);
        Vendedor karen = new Vendedor("Karen", 28, 'F', 6500, 59000);
        Desenvolvedor filipe = new Desenvolvedor("Filipe", 30, 'M',20000, "filipe@test.com");
        Cliente cliente = new Cliente("cliente@test.com", "12345");

        boolean aunteticaFilipe = filipe.autentica("filipe@test.com", filipe.getSenha());
        boolean aunteticaCliente = filipe.autentica("cliente@test.com", "12345");

        System.out.println(aunteticaFilipe);
        System.out.println(aunteticaFilipe);

        //System.out.println("\nSenha Filipe: " + filipe.getSenha());


        anna.imprimeFuncionario();
        velasco.imprimeGerente();
        karen.imprimeVendedor();
        filipe.imprimeDesenvolvedor();

        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = anna;
        funcionarios[1] = velasco;
        funcionarios[2] = karen;
        funcionarios[3] = filipe;

        CalculadorFolha folha = new CalculadorFolha();
        double total = folha.calcula(funcionarios);

        System.out.println("\nTotal da folha de pagamento: " + NumberFormat.getCurrencyInstance(localeBrasil).format(total));

        FileOutputStream fos = new FileOutputStream("funcionarios.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bf = new BufferedWriter(osw);

        bf.append(anna.toString());
        bf.newLine();
        bf.append(velasco.toString());
        bf.newLine();
        bf.append(karen.toString());
        bf.newLine();
        bf.append(filipe.toString());

        bf.close();
    }
}
