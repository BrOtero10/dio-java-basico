package generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {
        Set<String> conjuntoGenerics = new HashSet<>();

        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        for(String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }
    }
}
