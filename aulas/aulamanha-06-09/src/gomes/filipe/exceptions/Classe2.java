package gomes.filipe.exceptions;

public class Classe2 {

    public void metod2() throws NullPointerException, ArithmeticException {
        System.out.println("Executando o método 2");

        int valor = 10 / 1;
        System.out.println("O valor da divisão é: " + valor);

        Classe3 obj3 = new Classe3();
        obj3.metod3();
        System.out.println("Finalizando o método 3");
    }
}
