public class ListaLigada {

    private Node head;
    private Node tail;
    private int size;

    public ListaLigada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(int valor) {
        Node novo = new Node(valor);

        if (isEmpty()) {
            head = novo;
            tail = novo;
        } else {
            novo.setProximo(head);
            head = novo;
        }

        size++;
    }

    public void addLast(int valor) {
        Node novo = new Node(valor);

        if (isEmpty()) {
            head = novo;
            tail = novo;
        } else {
            tail.setProximo(novo);
            tail = novo;
        }

        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        }

        int valor = head.getValor();

        head = head.getProximo();

        if (head == null) {
            tail = null;
        }

        size--;

        return valor;
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        }

        if (head == tail) {

            int valor = head.getValor();

            head = null;
            tail = null;

            size--;

            return valor;
        }

        Node atual = head;

        while (atual.getProximo() != tail) {
            atual = atual.getProximo();
        }

        int valor = tail.getValor();

        atual.setProximo(null);
        tail = atual;

        size--;

        return valor;
    }

    public boolean contains(int valor) {
        Node atual = head;

        while (atual != null) {

            if (atual.getValor() == valor) {
                return true;
            }

            atual = atual.getProximo();
        }

        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        Node atual = head;

        System.out.print("HEAD -> ");

        while (atual != null) {
            System.out.print(atual.getValor() + " -> ");
            atual = atual.getProximo();
        }

        System.out.println("NULL");
    }

}