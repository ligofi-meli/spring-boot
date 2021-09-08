package gomes.filipe.aula6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("Juvenal");
        nomes.add("Maria");
        nomes.add("Cleyton");
        nomes.add("Clara");

        iterarPorIterator(nomes);
        iterarPorForEach(nomes);
        iterarPorLoop(nomes);
    }

    private static void iterarPorIterator(LinkedList<String> nomes) {
        System.out.println("\n--- Iterando por iterator ---");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterarPorForEach(LinkedList<String> nomes) {
        System.out.println("\n--- Iterando por foreach ---");
        for (String item : nomes) {
            System.out.println(nomes);
        }
    }

    private static void iterarPorLoop(LinkedList<String> nomes) {
        System.out.println("\n--- Iterando por loop ---");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
