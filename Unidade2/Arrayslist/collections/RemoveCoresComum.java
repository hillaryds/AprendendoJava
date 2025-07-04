package Arrayslist.collections;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveCoresComum {

    // Remove da primeira lista os elementos que aparecem na segunda, usando Iterator
    public static void removerComuns(LinkedList<String> lista1, LinkedList<String> lista2) {
        Iterator<String> it = lista1.iterator();
        while (it.hasNext()) {
            String cor = it.next();
            if (lista2.contains(cor)) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> cores1 = new LinkedList<>(Arrays.asList("Azul", "Verde", "Amarelo", "Vermelho", "Roxo"));

        LinkedList<String> cores2 = new LinkedList<>();
        cores2.add("Verde");
        cores2.add("Roxo");
        cores2.add("Preto");

        System.out.println("Lista 1 antes da remoção: " + cores1);

        removerComuns(cores1, cores2);

        System.out.println("Lista 1 depois da remoção: " + cores1);
    }
}
