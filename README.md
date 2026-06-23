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
