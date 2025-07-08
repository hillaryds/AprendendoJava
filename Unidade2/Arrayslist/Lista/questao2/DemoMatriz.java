package Arrayslist.Lista.questao2;

public class DemoMatriz {
    public static void main(String[] args) {
        Matriz nova = new Matriz(2, 1, 1, 1);
        System.out.println("Determinante: " + nova.calculaDeterminate());
        System.out.println(nova);
    }
}
