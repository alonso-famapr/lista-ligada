public class ListaLigada {

    private Node head;
    private Node tail;

    public ListaLigada() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int valor) {
        if (this.isEmpty()) {
            Node newNode = new Node(valor);
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node newNode = new Node(valor);
            newNode.setProximo(this.head);
            this.head = newNode;
        }
    }

    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

}
