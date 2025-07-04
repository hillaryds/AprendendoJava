package Arrayslist.collections;

import java.util.Stack;

public class PilhaNumerica {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();

        // Adicionando elementos de tipos numéricos variados
        pilha.push(10);         // int
        pilha.push(3.14);       // double
        pilha.push(7L);         // long
        pilha.push(2.5f);       // float
        pilha.push((short)4);   // short
        pilha.push((byte)1);    // byte

        System.out.println("Pilha após inserções: " + pilha);

        // Removendo elementos até esvaziar a pilha
        while (!pilha.isEmpty()) {
            Number removido = pilha.pop();
            System.out.println("Removido: " + removido);
            System.out.println("Pilha agora: " + pilha);
        }
    }
}
