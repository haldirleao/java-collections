package map;

/* 
Faça um programa que simule um lançamento de dados. 
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
 */
// Materiais de apoio:
// https://www.digitalocean.com/community/tutorials/random-number-generator-java
// 

import java.util.*;

public class DesafioLancamentoDados {
    public static void main(String[] args) {

        Dado meuDado = new Dado();

        // criei Map somente pq o desafio estava na aula sobre Maps.
        // poderia ter sido uma Lista.
        Map<Integer, Integer> valoresDoDado = new HashMap<>();

        int qtdeLancamentos = 100;
        for (int i = 1; i <= qtdeLancamentos; i++) {
            meuDado.lancarDado();
            valoresDoDado.put(i, meuDado.getLadoAtual());
        }
        System.out.println("Número de lançamentos: " + valoresDoDado.size());

        // Não consegui melhorar fazendo um laço (for/while), passando a variável
        // contadora como argumento no filter(). Ocorre o erro: Local variable
        // defined in an enclosing scope must be final or effectively final.
        long cont1 = valoresDoDado.values().stream().filter(num -> num == 1).count();
        System.out.println("O valor 1 ocorreu " + cont1 + " vezes. P = " + (double) cont1 / (double) qtdeLancamentos);

        long cont2 = valoresDoDado.values().stream().filter(num -> num == 2).count();
        System.out.println("O valor 2 ocorreu " + cont2 + " vezes. P = " + (double) cont2 / (double) qtdeLancamentos);

        long cont3 = valoresDoDado.values().stream().filter(num -> num == 3).count();
        System.out.println("O valor 3 ocorreu " + cont3 + " vezes. P = " + (double) cont3 / (double) qtdeLancamentos);

        long cont4 = valoresDoDado.values().stream().filter(num -> num == 4).count();
        System.out.println("O valor 4 ocorreu " + cont4 + " vezes. P = " + (double) cont4 / (double) qtdeLancamentos);

        long cont5 = valoresDoDado.values().stream().filter(num -> num == 5).count();
        System.out.println("O valor 5 ocorreu " + cont5 + " vezes. P = " + (double) cont5 / (double) qtdeLancamentos);

        long cont6 = valoresDoDado.values().stream().filter(num -> num == 6).count();
        System.out.println("O valor 6 ocorreu " + cont6 + " vezes. P = " + (double) cont6 / (double) qtdeLancamentos);
    }

}

class Dado {

    private int ladoAtual;

    // constructor
    Dado() {
        lancarDado();
    }

    // getter
    int getLadoAtual() {
        return ladoAtual;
    }

    void lancarDado() {
        Random r = new Random();
        this.ladoAtual = r.nextInt(1, 7); // retorna int de 1 a 6

        // this.ladoAtual = (int) (Math.random() * 6) + 1; // outra forma de retornar 1
        // a 6
    }
}