package gomes.filipe.exceptions;

public class Classe1 {

    public void metod1() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("Executando o método 1");

        String[] array = {"f", "i", "l", "i", "p", "e"};
        for (int i = 0; i <= array.length; i++) {
            System.out.println("Método 1: " + array[i]);
        }

        Classe2 obj2 = new Classe2();
        obj2.metod2();

        System.out.println("Finalizando o método 1");
    }
}
