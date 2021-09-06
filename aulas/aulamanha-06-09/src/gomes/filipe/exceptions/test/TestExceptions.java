package gomes.filipe.exceptions.test;

import gomes.filipe.exceptions.Classe1;

public class TestExceptions {

    public static void main(String[] args) {

        Classe1 obj1 = new Classe1();

        try{
            obj1.metod1();
            System.out.println("Programa finalizado");
        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
