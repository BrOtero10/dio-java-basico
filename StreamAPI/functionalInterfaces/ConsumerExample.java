package StreamAPI.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operaçção que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor
 */

public class ConsumerExample {
    public static void main(String[] args) {
        // Criando lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        System.out.println("\nUsando Consumer:\n");
        numeros.stream().forEach(imprimirNumeroPar);

        // Usar LAMBDA para imprimir números pares
        System.out.println("\n\nUsando LAMBDA:\n");
        numeros.forEach(n -> {
            if(n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}