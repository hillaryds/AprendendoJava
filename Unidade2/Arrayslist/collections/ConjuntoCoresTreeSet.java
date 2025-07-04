package Arrayslist.collections;

import java.util.TreeSet;
import java.util.SortedSet;

public class ConjuntoCoresTreeSet {
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();

        // Inserindo cores, incluindo repetições
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Azul"); // repetido
        cores.add("Verde"); // repetido

        System.out.println("Conjunto de cores (TreeSet): " + cores);

        String corSelecionada = "Roxo";

        // Cores antes da cor selecionada (ordem alfabética)
        SortedSet<String> antes = cores.headSet(corSelecionada);
        System.out.println("Cores antes de \"" + corSelecionada + "\": " + antes);

        // Cores a partir da cor selecionada (inclusive)
        SortedSet<String> aPartir = cores.tailSet(corSelecionada);
        System.out.println("Cores a partir de \"" + corSelecionada + "\": " + aPartir);

        // Primeiro e último elementos
        System.out.println("Primeira cor: " + cores.first());
        System.out.println("Última cor: " + cores.last());
    }
}
