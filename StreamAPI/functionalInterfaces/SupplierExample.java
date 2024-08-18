package StreamAPI.functionalInterfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinadoo tipo.
 */


public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier com expressão para obter uma lista com 5 saudações
        List<String> listaSaudacoes1 = Stream.generate(saudacao)
            .limit(3)
            .toList();

        // Imprimir as saudações geradas
        listaSaudacoes1.forEach(System.out::println);
        
        System.out.println();

        // Passando o Supplier no generate

        List<String> listaSaudacao2 = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
        .limit(3)
        .toList();

        listaSaudacao2.forEach((System.out::println));
    }
}
