package Arrayslist.collections;

import java.util.PriorityQueue;

public class FilaPrioridadeDouble {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();

        // Adicionando elementos à fila de prioridades
        fila.add(5.2);
        fila.add(1.8);
        fila.add(3.7);
        fila.add(9.0);
        fila.add(2.4);

        System.out.println("Fila de prioridades inicial: " + fila);

        // Removendo e apresentando os elementos até a fila ficar vazia
        while (!fila.isEmpty()) {
            Double removido = fila.poll();
            System.out.println("Removido: " + removido);
            System.out.println("Fila agora: " + fila);
        }
    }
}
