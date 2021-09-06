package gomes.filipe.exceptions;

import gomes.filipe.model.Diretor;
import gomes.filipe.model.Funcionario;

public class Classe3 {

    private Funcionario funcionario;

    public void metod3() throws NullPointerException {
        System.out.println("Executando o método 3");

        System.out.println("Salário do diretor: " + funcionario.getSalario());

        funcionario = new Diretor("Barbara", 53, 'F', 200000);

        System.out.println("Finalizando o método 3");
    }
}
