
package Arrayslist.Lista.questao4;

/*Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
 para um método produto utilizando uma lista de argumentos de comprimento variável.
 Escreva também uma classe executável que teste seu método com várias chamadas,
 cada uma com um número diferente de argumentos.*/
public class ProdutoApp {

    // Método que calcula o produto de uma quantidade variável de inteiros
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int n : numeros) {
            resultado *= n;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Produto de 2, 3: " + produto(2, 3));
        System.out.println("Produto de 1, 2, 3, 4: " + produto(1, 2, 3, 4));
        System.out.println("Produto de 5: " + produto(5));
        System.out.println("Produto de 7, 2, 2: " + produto(7, 2, 2));
        System.out.println("Produto de nenhum argumento: " + produto());
    }
} 