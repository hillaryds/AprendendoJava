package colecoes.questao93;

import java.util.LinkedList;

public class LinkedListInversa {
    public static void main(String[] args) {
        // Criando a primeira LinkedList com 10 caracteres
        LinkedList<Character> listaOriginal = new LinkedList<>();
        
        // Adicionando 10 caracteres à lista original
        listaOriginal.add('A');
        listaOriginal.add('B');
        listaOriginal.add('C');
        listaOriginal.add('D');
        listaOriginal.add('E');
        listaOriginal.add('F');
        listaOriginal.add('G');
        listaOriginal.add('H');
        listaOriginal.add('I');
        listaOriginal.add('J');
        
        System.out.println("Lista original:");
        System.out.println(listaOriginal);
        
        // Criando a segunda LinkedList com os elementos em ordem inversa
        LinkedList<Character> listaInversa = new LinkedList<>();
        
        // Invertendo manualmente sem usar métodos da Java API
        // Percorrendo a lista original de trás para frente
        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            Character elemento = listaOriginal.get(i);
            listaInversa.add(elemento);
        }
        
        System.out.println("\nLista inversa:");
        System.out.println(listaInversa);
        
        // Demonstrando que as listas são independentes
        System.out.println("\n=== VERIFICAÇÃO ===");
        System.out.println("Tamanho da lista original: " + listaOriginal.size());
        System.out.println("Tamanho da lista inversa: " + listaInversa.size());
        
        // Mostrando elemento por elemento para melhor visualização
        System.out.println("\n=== COMPARAÇÃO ELEMENTO POR ELEMENTO ===");
        System.out.println("Posição | Original | Inversa");
        System.out.println("--------|----------|--------");
        
        for (int i = 0; i < listaOriginal.size(); i++) {
            System.out.printf("   %d    |    %c     |    %c\n", 
                            i, 
                            listaOriginal.get(i), 
                            listaInversa.get(i));
        }
        
        // Método alternativo de inversão usando iteração simples
        System.out.println("\n=== MÉTODO ALTERNATIVO DE INVERSÃO ===");
        LinkedList<Character> listaInversa2 = inverterLista(listaOriginal);
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista inversa (método 2): " + listaInversa2);
    }
    
    // Método auxiliar para inverter uma LinkedList sem usar métodos da API
    public static LinkedList<Character> inverterLista(LinkedList<Character> listaOriginal) {
        LinkedList<Character> listaInvertida = new LinkedList<>();
        
        // Percorrendo a lista original e adicionando elementos no início da nova lista
        for (Character elemento : listaOriginal) {
            listaInvertida.addFirst(elemento);
        }
        
        return listaInvertida;
    }
}
