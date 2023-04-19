package set;

import java.util.*;

/* Crie uma classe LinguagemFavorita que possua os atributos 
nome, anoDeCriacao e ide. Em seguida, crie um conjunto 
com 3 linguagens e faça um programa que ordene esse conjunto por:
A. Ordem de Inserção
B. Ordem Natural (nome)
C. IDE
D. Ano de criação e nome
E. Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

class ExercicioProposto2 {
    public static void main(String[] args) {

        System.out.println("-- Criando e imprimindo o Set --");
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>() {
            {
                add(new LinguagemFavorita("Visual Basic", 1990, "Visual Studio"));
                add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
                add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            }
        };
        for (LinguagemFavorita linguagem : minhasLinguagens)
        System.out.println(linguagem);
        
        System.out.println("\n-- Ordem inserção --");
        // como o set é LinkedHashSet, é impresso conforme a ordem da inserção.
        for (LinguagemFavorita linguagem : minhasLinguagens)
        System.out.println(linguagem);
        
        System.out.println("\n-- Ordem Natural (nome) --");
        // set TreeSet com compareTo() definido na classe LinguagemFavorita
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens2)
        System.out.println(linguagem);
        
        System.out.println("\n-- Ordem (IDE) --");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens3)
        System.out.println(linguagem);
        
        System.out.println("\n-- Ordem (Ano de criação e nome) --");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens4)
        System.out.println(linguagem);
        
        System.out.println("\n-- Ordem (Nome, ano de criacao e IDE) --");
        System.out.println("-- Este é o override padrão da classe LinguagemFavorita --");
        System.out.println("-- Então basta criar o set TreeSet --");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(){{
            add(new LinguagemFavorita("a", 1990, "c"));
            add(new LinguagemFavorita("a", 1990, "b"));
            add(new LinguagemFavorita("a", 1990, "a"));
        }};
        for (LinguagemFavorita linguagem : minhasLinguagens5)
        System.out.println(linguagem);
            
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareTo(l2.getIde());
        return ide;
        // !!! PROBLEMA: Se existirem dois objetos com a mesma ide, imprimirá somente 1
        // deles. PARA RESOLVER: faça outras comparações na sequencia. Exemplo: ano de
        // criação e nome
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0)
            return ano;

        int nome = l1.getNome().compareTo(l2.getNome());
        return nome;
    }
}