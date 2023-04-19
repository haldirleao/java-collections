package set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("\n -- Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("\n -- Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\n -- A quantidade de cores que o arco-íris tem: ");
        System.out.println(coresArcoIris.size());

        System.out.println("\n -- Exiba as cores em ordem alfabética: ");
        // Notas: Tree set ordena os elementos na sua ordem natural. Ordem natural de
        // String é lexicográfica (alfabética). Para saber mais:
        // https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("\n -- Exiba as cores na ordem inversa da que foi informada ");
        // LinkedHashSet mantêm os elementos na ordem em que eles foram adicionados.
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        // Collections.reverse(List<?> list) deve receber uma lista
        // Logo, foi necessário converter o set em uma lista
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\n -- Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor : coresArcoIris) {
            // acrestando toLowerCase() para se tornar NO CASE SENSITIVE
            if (cor.toLowerCase().startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("\n -- Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().toLowerCase().startsWith("v"))
                iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("\n -- Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println("\n -- Confira se o conjunto está vazio: ");
        System.out.println(coresArcoIris.isEmpty());
    }
}