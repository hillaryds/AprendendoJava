package execesoes.lista.questao102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomadorComTratamentoExcecao {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static int obterIntValido() {
        int numero = 0;
        boolean numeroValido = false;
        
        while (!numeroValido) {
            try {
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                numeroValido = true; // Se chegou aqui, o número é válido
                
            } catch (InputMismatchException e) {
                System.out.println(" ERRO: Entrada inválida! Por favor, digite apenas números inteiros.");
                scanner.nextLine(); // Limpa o buffer do scanner
                
            } catch (Exception e) {
                System.out.println(" ERRO: Ocorreu um erro inesperado: " + e.getMessage());
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        
        return numero;
    }
    
    /**
     * Método principal que utiliza obterIntValido() para obter dois operandos
     * e apresenta a soma deles
     */
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA SOMADOR COM TRATAMENTO DE EXCEÇÕES ===");
        System.out.println("Este programa soma dois números inteiros.");
        System.out.println("Digite apenas números inteiros válidos.\n");
        
        try {
            // Obtém o primeiro número usando o método obrigatório
            System.out.println(" Obtendo o primeiro número:");
            int numero1 = obterIntValido();
            
            // Obtém o segundo número usando o método obrigatório
            System.out.println("\n Obtendo o segundo número:");
            int numero2 = obterIntValido();
            
            // Calcula e apresenta a soma
            int soma = numero1 + numero2;
            
            System.out.println("\n RESULTADO:");
            System.out.println("Primeiro número: " + numero1);
            System.out.println("Segundo número: " + numero2);
            System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + soma);
            
        } catch (Exception e) {
            System.out.println(" ERRO CRÍTICO: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
            System.out.println("\n Programa finalizado.");
        }
    }
}
