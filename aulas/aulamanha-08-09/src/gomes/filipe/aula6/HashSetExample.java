package gomes.filipe.aula6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> animais = new HashSet<>();
        animais.add("águia de rapina");
        animais.add("camaleão");
        animais.add("suricate");
        animais.add("leopardo");
        animais.add("golfinho");
        animais.add("elefante");
        animais.add("orca");
        animais.add("tigre");

        iterarPorIterator(animais);
        iterarPorForEach(animais);
    }


    private static void iterarPorIterator(Set<String> set) {
        System.out.println("\n--- Iterando por iterator ---");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iterarPorForEach(Set<String> set) {
        System.out.println("\n--- Iterando por foreach ---");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
