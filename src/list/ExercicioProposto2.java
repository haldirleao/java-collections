package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Utilizando listas, faça um programa que faça 5 perguntas 
para uma pessoa sobre um crime. As perguntas são: 
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 

Se a pessoa responder positivamente a 2 questões 
ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassina".
Caso contrário, ela será classificado como "Inocente". */

public class ExercicioProposto2 {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>(Arrays.asList("Telefonou para a vítima?", "Esteve no local do crime?",
                "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"));

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("-- Para as perguntas abaixo, responda S (sim) ou N (não) --");

            int contSim = 0;
            int i = 0;
            while (i < perguntas.size()) {
                System.out.println(perguntas.get(i));
                String resposta = scan.next();

                // Fiquei um tempão tentando fazer "resposta == 's'".
                // Não funciona!!! use equals() para String.
                if (resposta.equalsIgnoreCase("s")) {
                    contSim++;
                    i++;
                } else if (resposta.equalsIgnoreCase("n")) {
                    i++;
                } else {
                    System.out.println("Resposta incorreta. Repetindo a pergunta.");
                }
            }

            // classificação do interrogado
            System.out.print("O interrogado é: ");
            switch (contSim) {
                case 2:
                    System.out.println("Suspeito");
                    break;
                case 3:
                case 4:
                    System.out.println("Cúmplice");
                    break;
                case 5:
                    System.out.println("Assassino");
                    break;
                default:
                    System.out.println("Inocente");

            }
        }

    }
}