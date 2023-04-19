package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
         * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo = gol - consumo = 14,4km/l
         * modelo = uno - consumo = 15,6 km/l
         * modelo = mobi - consumo = 16,1 km/l
         * modelo = hb20 - consumo = 14,5 km/l
         * modelo = kwid - consumo = 15,6 km/l
         */
        // FORMAS DE IMPLEMENTAÇÃO
        // Map carrosPopulares2020 = new HashMap(); //antes do java 5
        // Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) -
        // Diamont Operator(jdk 7)
        // HashMap<String, Double> carrosPopulares = new HashMap<>();
        // Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6,
        // "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: "); // HashMap não
        // suporta ordem. LinkedHashMap sim.

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        // Map.Entry como é uma visão de set, suporta iteração, etc
        Set<Map.Entry<String, Double>> entriesCarrosPopulares = carrosPopulares.entrySet();
        String modeloConsumoMaisEficiente = "";
        System.out.println("Dados do Map.Entry: " + entriesCarrosPopulares.getClass() + ": " + entriesCarrosPopulares);

        for (Map.Entry<String, Double> entry : entriesCarrosPopulares) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloConsumoMaisEficiente = entry.getKey();
                System.out.println("Modelo com consumo mais eficiente: " + modeloConsumoMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println("\n" +carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram adicionados ao dict: ");
        // LinkedHashMap ordena na ordem que os elementos foram incluídos no dicionário
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            {
                put("hb20", 14.5);
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        // TreeMap ordena os elementos de acordo à ordem natural de suas chaves (keys)
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
