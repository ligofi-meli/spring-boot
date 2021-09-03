package gomes.filipe.domain;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Funcionario anna = new Funcionario("Anna", 30, 'F',8000 );
        Gerente velasco = new Gerente("Velasco", 57, 'M', 68000);
        Vendedor karen = new Vendedor("Karen", 28, 'F', 6500, 59000);
        Desenvolvedor filipe = new Desenvolvedor("Filipe", 30, 'M',20000);

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

        anna.imprimeFuncionario();
        velasco.imprimeGerente();
        karen.imprimeVendedor();
        filipe.imprimeDesenvolvedor();
    }
}
