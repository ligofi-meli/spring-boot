package gomes.filipe.aula6;

import java.util.Iterator;
import java.util.Vector;

public class VectorListExample {

    public static void main(String[] args) {

        Vector<String> objetos = new Vector<>();
        objetos.add("caneta ponta 0.4 mm");
        objetos.add("caderno de 1 matéria 96 folhas");
        objetos.add("óculos com lente transition");
        objetos.add("edredon marrom");
        objetos.add("filtro de linha com 6 entradas para tomadas");

        iterarPorIterator(objetos);
        iterarPorForEach(objetos);
        iterarPorLoop(objetos);
    }

    private static void iterarPorIterator(Vector<String> objetos) {
        System.out.println("\n--- Iterando por iterator ---");
        Iterator<String> iterator = objetos.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterarPorForEach(Vector<String> objetos) {
        System.out.println("\n--- Iterando por foreach ---");
        for (String item : objetos) {
            System.out.println(item);
        }
    }

    private static void iterarPorLoop(Vector<String> objetos) {
        System.out.println("\n--- Iterando por loop ---");
        for (int i = 0; i < objetos.size(); i++) {
            System.out.println(objetos.get(i));
        }
    }
}
