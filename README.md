# Lista Ligada Simples em Java

## Objetivo

Este projeto implementa uma **Lista Ligada Simples (Singly Linked List)** em Java para fins didáticos na disciplina de **Estrutura de Dados I**.

O objetivo é compreender como estruturas dinâmicas de dados funcionam internamente, sem utilizar coleções prontas da biblioteca Java.

---

## Versão do Java utilizada em sala de aula
- Java 21


---

## Conceitos Fundamentais

Uma Lista Ligada é uma estrutura linear composta por nós (*nodes*).

Cada nó armazena:

* Um valor
* Uma referência para o próximo nó da lista

Exemplo:

```text
HEAD
 ↓
[10] -> [20] -> [30] -> NULL
                         ↑
                        TAIL
```

Onde:

* **HEAD** aponta para o primeiro elemento.
* **TAIL** aponta para o último elemento.
* **NULL** indica o fim da lista.

---

## Características da Lista Ligada

- Estrutura dinâmica de dados.
- Não possui tamanho fixo.
- Os elementos não precisam estar armazenados em posições contíguas de memória.
- Cada elemento mantém uma referência para o próximo elemento.
- Permite inserções e remoções eficientes no início da lista.
- O acesso aos elementos é sequencial.

---

## Estrutura do Projeto

```text
src/
├── Node.java
├── ListaLigada.java
└── Main.java
```

### Node.java

Representa um nó da lista.

Atributos:

```java
private int valor;
private Node proximo;
```

Exemplo:

```text
[10 | referência]
```

---

### ListaLigada.java

Implementa a estrutura da lista ligada.

Atributos:

```java
private Node head;
private Node tail;
private int size;
```

| Atributo | Descrição               |
| -------- | ----------------------- |
| head     | Primeiro elemento       |
| tail     | Último elemento         |
| size     | Quantidade de elementos |

---

## Operações Implementadas

### addFirst(int valor)

Insere um elemento no início da lista.

Exemplo:

Antes:

```text
HEAD -> 20 -> 30 -> NULL
```

Depois:

```text
HEAD -> 10 -> 20 -> 30 -> NULL
```

Complexidade:

```text
O(1)
```

---

### addLast(int valor)

Insere um elemento no final da lista.

Exemplo:

Antes:

```text
HEAD -> 10 -> 20 -> NULL
```

Depois:

```text
HEAD -> 10 -> 20 -> 30 -> NULL
```

Complexidade:

```text
O(1)
```

---

### removeFirst()

Remove o primeiro elemento da lista.

Exemplo:

Antes:

```text
HEAD -> 10 -> 20 -> 30 -> NULL
```

Depois:

```text
HEAD -> 20 -> 30 -> NULL
```

Complexidade:

```text
O(1)
```

---

### removeLast()

Remove o último elemento da lista.

Exemplo:

Antes:

```text
HEAD -> 10 -> 20 -> 30 -> NULL
```

Depois:

```text
HEAD -> 10 -> 20 -> NULL
```

Complexidade:

```text
O(n)
```

Observação:

Mesmo possuindo a referência para o último elemento (`tail`), é necessário percorrer a lista para localizar o penúltimo nó.

---

### contains(int valor)

Verifica se determinado valor existe na lista.

Exemplo:

```java
lista.contains(20);
```

Resultado:

```text
true
```

Complexidade:

```text
O(n)
```

---

### clear()

Remove todos os elementos da lista.

Exemplo:

Antes:

```text
HEAD -> 10 -> 20 -> 30 -> NULL
```

Depois:

```text
HEAD -> NULL
```

Complexidade:

```text
O(1)
```

---

### size()

Retorna a quantidade de elementos armazenados.

Exemplo:

```java
System.out.println(lista.size());
```

Complexidade:

```text
O(1)
```

---

### isEmpty()

Verifica se a lista está vazia.

Exemplo:

```java
lista.isEmpty();
```

Complexidade:

```text
O(1)
```

---

## Exemplo de Execução

```java

ListaLigada lista = new ListaLigada();

        System.out.println("Lista vazia? " + lista.isEmpty());
        System.out.println("Tamanho: " + lista.size());

        System.out.println("\n=== Inserindo no início ===");

        System.out.println("Inserido no início: " + 30);
        lista.addFirst(30);
        lista.print();

        System.out.println("Inserido no início: " + 20);
        lista.addFirst(20);
        lista.print();

        System.out.println("Inserido no início: " + 10);
        lista.addFirst(10);
        lista.print();

        System.out.println("Tamanho: " + lista.size());

        System.out.println("\n=== Inserindo no final ===");

        System.out.println("Inserido no final: " + 40);
        lista.addLast(40);
        lista.print();

        System.out.println("Inserido no final: " + 50);
        lista.addLast(50);
        lista.print();

        System.out.println("Tamanho: " + lista.size());

        System.out.println("\n=== Pesquisando elementos ===");

        System.out.println("Contém 20? " + lista.contains(20));
        System.out.println("Contém 99? " + lista.contains(99));


        System.out.println("\nLista atual");
        lista.print();
        System.out.println("=== Removendo do início ===");

int removidoInicio = lista.removeFirst();
        System.out.println("Removido: " + removidoInicio);

        lista.print();

        System.out.println("\n=== Removendo do final ===");

int removidoFinal = lista.removeLast();
        System.out.println("Removido: " + removidoFinal);

        lista.print();

        System.out.println("\n=== Estado final ===");

        System.out.println("Lista vazia? " + lista.isEmpty());
        System.out.println("Tamanho: " + lista.size());

        lista.print();

        System.out.println("\n=== Limpando a lista ===");

        lista.clear();

        lista.print();

        System.out.println("Lista vazia? " + lista.isEmpty());
        System.out.println("Tamanho: " + lista.size());
```

Saída:

```text
Lista vazia? true
Tamanho: 0

=== Inserindo no início ===
Inserido no início: 30
HEAD -> 30 -> NULL
Inserido no início: 20
HEAD -> 20 -> 30 -> NULL
Inserido no início: 10
HEAD -> 10 -> 20 -> 30 -> NULL
Tamanho: 3

=== Inserindo no final ===
Inserido no final: 40
HEAD -> 10 -> 20 -> 30 -> 40 -> NULL
Inserido no final: 50
HEAD -> 10 -> 20 -> 30 -> 40 -> 50 -> NULL
Tamanho: 5

=== Pesquisando elementos ===
Contém 20? true
Contém 99? false

Lista atual
HEAD -> 10 -> 20 -> 30 -> 40 -> 50 -> NULL
=== Removendo do início ===
Removido: 10
HEAD -> 20 -> 30 -> 40 -> 50 -> NULL

=== Removendo do final ===
Removido: 50
HEAD -> 20 -> 30 -> 40 -> NULL

=== Estado final ===
Lista vazia? false
Tamanho: 3
HEAD -> 20 -> 30 -> 40 -> NULL

=== Limpando a lista ===
HEAD -> NULL
Lista vazia? true
Tamanho: 0
```

---

## Complexidade das Operações

| Operação      | Complexidade |
| ------------- | ------------ |
| addFirst()    | O(1)         |
| addLast()     | O(1)         |
| removeFirst() | O(1)         |
| removeLast()  | O(n)         |
| contains()    | O(n)         |
| clear()       | O(1)         |
| size()        | O(1)         |
| isEmpty()     | O(1)         |


---

## Entendendo a Notação Big O

A notação **Big O** é utilizada para medir a eficiência de algoritmos e estruturas de dados. Ela descreve como o tempo de execução cresce à medida que a quantidade de dados aumenta.

Em outras palavras, a notação Big O nos ajuda a responder à seguinte pergunta:

> O que acontece com o desempenho do algoritmo quando a quantidade de elementos aumenta?

### Complexidade O(1) – Tempo Constante

Uma operação possui complexidade **O(1)** quando sua execução leva praticamente o mesmo tempo, independentemente da quantidade de elementos armazenados na estrutura.

Exemplos na Lista Ligada:

* `addFirst()`
* `removeFirst()`
* `size()`
* `isEmpty()`
* `clear()`

Por exemplo, para inserir um elemento no início da lista (`addFirst()`), basta atualizar algumas referências (`head`), sem percorrer os elementos existentes.

```text
10 elementos   -> tempo constante
100 elementos  -> tempo constante
1000 elementos -> tempo constante
```

---

### Complexidade O(n) – Tempo Linear

Uma operação possui complexidade **O(n)** quando seu tempo de execução cresce proporcionalmente à quantidade de elementos da estrutura.

Exemplos na Lista Ligada:

* `contains()`
* `removeLast()`

Para verificar se um valor existe na lista (`contains()`), pode ser necessário percorrer todos os nós até encontrar o elemento desejado ou chegar ao final da lista.

```text
10 elementos   -> até 10 verificações
100 elementos  -> até 100 verificações
1000 elementos -> até 1000 verificações
```

Quanto maior a lista, maior será o tempo necessário para concluir a operação.

---

### Por que removeLast() é O(n)?

Mesmo existindo a referência para o último nó (`tail`), uma Lista Ligada Simples não possui referência para o nó anterior.

Considere a lista:

```text
HEAD
 ↓
[10] -> [20] -> [30] -> [40] -> NULL
                           ↑
                          TAIL
```

Para remover o elemento `40`, é necessário localizar o nó `30`, que passará a ser o novo último elemento da lista.

Como cada nó conhece apenas seu próximo nó, é necessário percorrer a lista desde o início até encontrar o penúltimo elemento.

Por esse motivo, a operação possui complexidade:

```text
O(n)
```

---

### Resumo

| Complexidade | Significado     | Exemplo na Lista Ligada                 |
| ------------ | --------------- | --------------------------------------- |
| O(1)         | Tempo constante | `addFirst()`, `removeFirst()`, `size()` |
| O(n)         | Tempo linear    | `contains()`, `removeLast()`            |

Em geral, operações que exigem percorrer a lista possuem complexidade **O(n)**, enquanto operações que manipulam apenas referências já conhecidas possuem complexidade **O(1)**.

### Comparação de Crescimento

| Quantidade de Elementos | O(1)       | O(n)                 |
| ----------------------- | ---------- | -------------------- |
| 10                      | 1 operação | até 10 operações     |
| 100                     | 1 operação | até 100 operações    |
| 1.000                   | 1 operação | até 1.000 operações  |
| 10.000                  | 1 operação | até 10.000 operações |

Observe que algoritmos com complexidade **O(1)** mantêm o mesmo desempenho independentemente do tamanho da estrutura, enquanto algoritmos **O(n)** tornam-se progressivamente mais custosos conforme a quantidade de elementos aumenta.
