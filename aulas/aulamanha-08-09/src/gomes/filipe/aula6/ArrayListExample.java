package gomes.filipe.aula6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("abacate");
        frutas.add("tangerina");
        frutas.add("cocô");
        frutas.add("morango");
        frutas.add("acerola");
        frutas.add("uva");
        frutas.add("jaca");
        frutas.add("framboesa");

        iterarPorIterator(frutas);
        iteratorPorForEach(frutas);
        iterandoPorLoop(frutas);
    }

    private static void iterarPorIterator(ArrayList<String> frutas) {
        System.out.println("\n--- Iterando por iterator ---");
        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iteratorPorForEach(ArrayList<String> frutas) {
        System.out.println("\n--- Iterando por foreach ---");
        for (String item : frutas) {
            System.out.println(item);
        }
    }

    private static void iterandoPorLoop(ArrayList<String> frutas) {
        System.out.println("\n--- Iterando por loop ---");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }
    }
}
