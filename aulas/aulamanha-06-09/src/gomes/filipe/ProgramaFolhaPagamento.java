package gomes.filipe;

import gomes.filipe.model.*;

import java.text.NumberFormat;
import java.util.Locale;

public class ProgramaFolhaPagamento {

    public static void main(String[] args) {

        Locale localeBrasil = new Locale("pt", "BR");

        Funcionario anna = new Funcionario("Anna", 30, 'F',8000 );
        Gerente velasco = new Gerente("Velasco", 57, 'M', 68000);
        Vendedor karen = new Vendedor("Karen", 28, 'F', 6500, 59000);
        Desenvolvedor filipe = new Desenvolvedor("Filipe", 30, 'M',20000, "filipe@test.com");
        Diretor senna = new Diretor("Senna", 64, 'M', 200000);

        Funcionario[] funcionarios = {anna, velasco, karen, filipe, senna};

        CalculadorFolha folha = new CalculadorFolha();
        double total = folha.calcula(funcionarios);

        System.out.println("\nTotal da folha de pagamento: " + NumberFormat.getCurrencyInstance(localeBrasil).format(total));
    }
}
