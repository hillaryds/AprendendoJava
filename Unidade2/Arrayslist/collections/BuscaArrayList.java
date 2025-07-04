package Arrayslist.collections;

import java.util.ArrayList;
import java.util.Collections;

public class BuscaArrayList {

    // Método que busca a String alvo em uma ArrayList ordenada
    public static void buscarCor(ArrayList<String> lista, String alvo) {
        int pos = Collections.binarySearch(lista, alvo);
        if (pos >= 0) {
            System.out.println("A cor \"" + alvo + "\" está na posição: " + (pos+1));
        } else {
            System.out.println("A cor \"" + alvo + "\" não está na lista.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Laranja");

        System.out.println("Lista original:");
        System.out.println(cores);

        Collections.sort(cores);

        System.out.println("Lista ordenada:");
        System.out.println(cores);

        buscarCor(cores, "Azul");
        buscarCor(cores, "Preto");
        buscarCor(cores, "Laranja");
    }
}
