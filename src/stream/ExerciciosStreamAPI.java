package stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

        public static void main(String[] args) {
                List<String> numerosAleatoriosStr = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                System.out.println("Imprima todos os elementos da lista (List.stream().forEach() : ");
                numerosAleatoriosStr.stream()
                                .forEach(System.out::print);

                System.out.println("\nImprima todos os elementos da lista (List.forEach()): ");
                numerosAleatoriosStr.forEach(System.out::print);

                System.out.println("\nPegue os 5 primeiros números e coloque dentro de uma Lista:");
                numerosAleatoriosStr.stream()
                                .limit(5)
                                .collect(Collectors.toList())
                                .forEach(System.out::print);

                System.out.println("\nLista com os 5 primeiros números. Imprimir a Lista:");
                List<String> list5PrimeirosNumeros = numerosAleatoriosStr.stream()
                                .limit(5)
                                .collect(Collectors.toList());
                System.out.println(list5PrimeirosNumeros);

                System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
                System.out.println("Antes: " + numerosAleatoriosStr);
                System.out.println("    o elemento da lista_str é: " + numerosAleatoriosStr.get(0).getClass());
                List<Integer> numerosAleatoriosInteger = numerosAleatoriosStr.stream()
                                .map(Integer::parseInt).collect(Collectors.toList());
                System.out.println("Depois: " + numerosAleatoriosInteger);
                System.out.println("    o elemento da lista_int é: " + numerosAleatoriosInteger.get(0).getClass());

                System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");

                System.out.println("-- Impressão forEach(System.out::println):");
                numerosAleatoriosStr.stream()
                                .map(Integer::parseInt)
                                .filter(i -> i % 2 == 0 && i > 2)
                                .collect(Collectors.toList())
                                .forEach(System.out::println);

                List<Integer> numerosAleatoriosMaioresQue2 = numerosAleatoriosInteger.stream()
                                .filter(i -> (i % 2 == 0 && i > 2))
                                .collect(Collectors.toList());
                System.out.println("-- Impressão da lista:");
                System.out.println(numerosAleatoriosMaioresQue2);

                System.out.println("\nMostre a média dos números: ");
                // numerosAleatoriosInteger.stream()
                // .average()
                // .ifPresent(System.out::println);

                numerosAleatoriosStr.stream()
                                .mapToInt(Integer::parseInt)
                                .average() // retorna um Optional Double: estudar sobre
                                .ifPresent(System.out::println);

                System.out.println("Crie uma nova lista com os elementos da lista anterior.");
                System.out.println("   Remova desta lista os valores ímpares: ");
                List<Integer> numerosAleatorios1SomentePares = new ArrayList<>(numerosAleatoriosInteger);
                System.out.println("-- Antes: " + numerosAleatorios1SomentePares);
                numerosAleatorios1SomentePares.removeIf(integer -> integer % 2 != 0);
                System.out.println("-- Depois: " + numerosAleatorios1SomentePares);

                // Para você
                System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
                numerosAleatoriosInteger.stream()
                                .skip(3)
                                .forEach(System.out::print);

                System.out.println("\n\nQuantos números diferentes existem na lista?:");
                System.out.println("-- Lista: " + numerosAleatoriosInteger);
                long countNumerosUnicos = numerosAleatoriosInteger.stream()
                                .distinct()
                                .count();
                System.out.println("-- números diferentes: " + countNumerosUnicos);

                System.out.println("\nRetirando os números repetidos da lista, quantos números ficam?");
                System.out.println(numerosAleatoriosInteger.size() - countNumerosUnicos);

                System.out.print("\nMostre o menor valor da lista: ");
                numerosAleatoriosInteger.stream()
                                .mapToInt(Integer::intValue)
                                .min()
                                .ifPresent(System.out::println);

                System.out.print("\nMostre o maior valor da lista: ");
                numerosAleatoriosInteger.stream()
                                .mapToInt(Integer::intValue)
                                .max()
                                .ifPresent(System.out::println);

                int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                                .filter(i -> (i % 2 == 0))
                                .mapToInt(Integer::intValue)
                                .sum();
                System.out.println("\nPegue apenas os números pares e some: " + somaDosNumerosPares);

                System.out.println("\nMostre a lista na ordem númerica: ");
                List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                                .sorted(Comparator.naturalOrder())
                                .collect(Collectors.toList());
                System.out.println(numerosOrdemNatural);

                System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
                // dica: collect(Collectors.groupingBy(new Function())
                Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                                .collect(Collectors
                                                .groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
                System.out.println(collectNumerosMultiplosDe3E5);
        }
}
