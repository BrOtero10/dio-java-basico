package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        // Criando lista do tipo String
        List<String> listaGenerics = new ArrayList<>();

        // Adicionando itens
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        for(String elemento : listaGenerics) {
            System.out.println(elemento);
        }
    }
}
