public class Main {

    public static void main(String[] args) {

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
    }
}