package gomes.filipe.aula6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> paises = new HashMap<>();
        paises.put("Brasil", "Brasília");
        paises.put("Reino Unido" , "Londres");
        paises.put("Rússia", "Moscou");
        paises.put("China", "Beijing");

        iterarPorIterator(paises);
        iteratorPorForEach(paises);

    }

    private static void iterarPorIterator(Map<String, String> paises) {
        System.out.println("\n--- Iterando por iterator ---");
        Iterator<Entry<String, String>> iterator = paises.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void iteratorPorForEach(Map<String , String> paises) {
        System.out.println("\n--- Iterando por foreach ---");
        for (Entry<String, String> item : paises.entrySet()) {
            System.out.println(item);
        }
    }
}
