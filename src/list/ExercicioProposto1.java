package list;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/* Faça um programa que receba a temperatura média dos 
6 primeiros meses do ano e armazene-as em uma lista. 
Após isto, calcule a média semestral das temperaturas e
 mostre todas as temperaturas acima desta média, e em 
 que mês elas ocorreram 
 (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).  */

public class ExercicioProposto1 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            List<String> meses = new ArrayList<>(
                    Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));

            List<Double> tempMediasMensais = new ArrayList<>();

            Random r = new Random();

            for (int i = 0; i < meses.size(); i++) {
                // para entrada via teclado
                // System.out.println("Entre com a temperatura média de " + meses.get(i) + ":
                // ");
                // tempMediasMensais.add(scan.nextDouble());

                // gera automaticamente temperaturas aleatórias, dada uma faixa de temperatura.
                double tempMin = 10.0d;
                double tempMax = 40.0d;
                double temp = (tempMin + (tempMax - tempMin) * r.nextDouble());
                
                temp = arredondar(temp, 1);
                tempMediasMensais.add(temp);
            }

            System.out.println("Lista - Meses: " + meses);
            System.out.println("Lista - Temperaturas médias mensais: " + tempMediasMensais);

            Double somaTemperatura = 0.0d;

            for (Double t : tempMediasMensais) {
                somaTemperatura += t;
            }
            Double mediaTemperaturaSemestral = somaTemperatura / tempMediasMensais.size();
            
            mediaTemperaturaSemestral = arredondar(mediaTemperaturaSemestral, 1);
            System.out.println("Temperatura - Média Semestral: " + mediaTemperaturaSemestral);

            System.out.println("Meses com temperaturas acima da média semestral: ");
            for (int i = 0; i < tempMediasMensais.size(); i++) {
                if (tempMediasMensais.get(i) > mediaTemperaturaSemestral) {
                    System.out.println(meses.get(i) + " : " + tempMediasMensais.get(i));
                }

            }
        }
    }

    // para saber mais: https://www.baeldung.com/java-round-decimal-number
    private static double arredondar(double numero, int casasDecimais) {
        double escala = Math.pow(10, casasDecimais); // 10^(casasDecimais)
        return Math.round(numero * escala) / escala; // (numero * 10^(casasDecimais)) / 10^(casasDecimais)
    }

}
