# Bootcamp DIO / Banco Pan Java Developer
## Módulo: Trabalhando com Collections Java
## Instrutora: Camila Cavalcante
https://www.linkedin.com/in/cami-la/

Estudante de Ciência de Computação, Software dev, Tech education coordinator na DIO.

# Tópicos estudados - Collections:

## Introdução: Collections

https://docs.oracle.com/javase/tutorial/collections/intro/index.html


https://data-flair.training/blogs/collection-framework-in-java/

Uma coleção (_collection_) — às vezes chamada de contêiner (_container_) — é simplesmente um objeto que agrupa vários elementos em uma única unidade. As coleções são usadas para armazenar, recuperar, manipular e comunicar dados agregados. Normalmente, eles representam itens de dados que formam um grupo natural, como uma mão de pôquer (uma coleção de cartas), uma pasta de correio (uma coleção de cartas) ou uma lista telefônica (um mapeamento de nomes para números de telefone).

Interface Collection https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

Classe Collections https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

## Aula 1: Lists - Coleções com iterações ordenadas 

Pacote: **java.util.List** https://docs.oracle.com/javase/8/docs/api/java/util/List.html

`interface List<E>`: uma coleção ordenada (também conhecida como sequência). O usuário desta interface tem controle preciso sobre onde na lista cada elemento é inserido. O usuário pode acessar elementos por seu índice inteiro (posição na lista) e pesquisar elementos na lista. Ao contrário dos conjuntos, as listas normalmente permitem elementos duplicados.

As listas permitem elementos com mesmo conteúdo e garante a ordem de inserção.

`ArrayList` ou `LinkedList`?
- `ArrayList`: usar quando mais operações de pesquisas são necessárias
- `LinkedList`: usar quando mais operações de inserção e exclusão são necessárias

Classe `ArrayList` https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

Classe `LinkedList` https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html 

## Aula 2: Set - Coleções com singularidade

Pacote: **java.util.Set**

https://docs.oracle.com/javase/8/docs/api/java/util/Set.html

`interface Set<E>`: uma coleção que não contém elementos duplicados. Mais formalmente, os conjuntos (set) não contêm nenhum par de elementos e1 e e2 tal que `e1.equals(e2)`, e no máximo um elemento nulo (`null`). Como está implícito em seu nome, essa interface modela a abstração de conjuntos matemáticos (set). Os set, geralmente, não possuem index (garantia de ordenamento).

Classe `HashSet` https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html 

Classe `LinkedHashSet` https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html

Classe `TreeSet` https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html

## Aula 3: Map - Coleção de pares

Pacote: **java.util.Map**

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html

`interface Map<K,V>`: um objeto que mapeia Chaves (_Keys_) a Valores (_Values_). Um mapa (_map_) não pode conter chaves duplicadas; cada chave pode mapear a, no máximo, um valor.

Classe `HashMap` https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html

Classe `LinkedHashMap` https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedHashMap.html

Classe `TreeMap` https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/TreeMap.html

Classe `HashTable` https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Hashtable.html

Interface `Map.Entry<K,V>` https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html

## Aula 4: Stream API

https://www.oracle.com/br/technical-resources/articles/java-stream-api.html

https://stackify.com/streams-guide-java-8/

Pacote **java.util.stream** : Classes para dar suporte a operações de estilo funcional em fluxos (_streams_) de elementos, como transformações map-reduce em coleções. https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html

`Interface Stream<T>`: uma sequência de elementos que suportam operações agregadas sequenciais e paralelas. https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html 

O exemplo a seguir ilustra uma operação agregada usando Stream e IntStream:

```java
int sum = widgets.stream()
                      .filter(w -> w.getColor() == RED)
                      .mapToInt(w -> w.getWeight())
                      .sum();
```

## Materiais de apoio
- https://github.com/cami-la/curso-dio-intro-collections
- https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
- _Object ordering_ https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
- _Introduction : Big O Notation_ https://www.baeldung.com/cs/big-o-notation
- _Practical Java Examples of the Big O Notation_ https://www.baeldung.com/java-algorithm-complexity
- https://www.digitalocean.com/community/tutorials/random-number-generator-java
- https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
- https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
- _Method References in Java_ ": :" https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
- https://stackoverflow.com/questions/1240387/where-are-the-java-system-packages-stored
- https://www.baeldung.com/java-8-functional-interfaces
- https://www.baeldung.com/java-8-lambda-expressions-tips
- https://www.baeldung.com/java-method-references
- https://docs.oracle.com/javase/8/docs/api/java/util/OptionalDouble.html

## Para saber mais
Dicas da instrutora sobre outros cursos DIO:
- Implementando Collections e Streams com Java - Instrutor: Wesley Fuchter
- Desenvolvimento Avançado em Java - Instrutor: João Paulo
- Aprenda o que são estrutura de dados e algorítmos - Instrutor: Bruno de Campos
---
haldirleao

Iniciado em 17/abr/2023. Concluído em 18/abr/2023.
