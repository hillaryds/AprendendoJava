package execesoes.lista.questao102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomadorAvancado {
    
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Método obrigatório que obtém um número inteiro válido
     * Implementa tratamento robusto de exceções
     * @return número inteiro válido
     */
    public static int obterIntValido() {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();
                
                // Validação adicional para números muito grandes
                if (numero == Integer.MAX_VALUE || numero == Integer.MIN_VALUE) {
                    System.out.println(" AVISO: Número no limite do tipo int!");
                }
                
                return numero;
                
            } catch (InputMismatchException e) {
                System.out.println(" ERRO: '" + scanner.next() + "' não é um número inteiro válido!");
                System.out.println("   Por favor, digite apenas números inteiros (ex: 123, -456).");
                
            } catch (Exception e) {
                System.out.println(" ERRO INESPERADO: " + e.getClass().getSimpleName() + 
                                 " - " + e.getMessage());
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }
    
    /**
     * Método alternativo que permite entrada via String (mais flexível)
     */
    public static int obterIntValidoAlternativo() {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                String entrada = scanner.nextLine();
                
                // Verifica se a string não está vazia
                if (entrada.trim().isEmpty()) {
                    throw new IllegalArgumentException("Entrada vazia não é permitida");
                }
                
                // Tenta converter para inteiro
                int numero = Integer.parseInt(entrada.trim());
                return numero;
                
            } catch (NumberFormatException e) {
                System.out.println(" ERRO: Formato inválido! Digite apenas números inteiros.");
                
            } catch (IllegalArgumentException e) {
                System.out.println(" ERRO: " + e.getMessage());
                
            } catch (Exception e) {
                System.out.println(" ERRO INESPERADO: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== SOMADOR AVANÇADO COM TRATAMENTO DE EXCEÇÕES ===");
        System.out.println("Demonstra diferentes técnicas de tratamento de exceções.\n");
        
        try {
            // Método 1: Usando Scanner.nextInt()
            System.out.println(" MÉTODO 1 - Scanner.nextInt():");
            int numero1 = obterIntValido();
            
            // Limpa o buffer após nextInt()
            scanner.nextLine();
            
            // Método 2: Usando Integer.parseInt()
            System.out.println("\n MÉTODO 2 - Integer.parseInt():");
            int numero2 = obterIntValidoAlternativo();
            
            // Verificação de overflow na soma
            try {
                long resultado = (long) numero1 + numero2;
                
                if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
                    System.out.println(" AVISO: Resultado da soma excede o limite do tipo int!");
                    System.out.println("Resultado (long): " + resultado);
                } else {
                    int soma = numero1 + numero2;
                    System.out.println("\n RESULTADO:");
                    System.out.println("Primeiro número: " + numero1);
                    System.out.println("Segundo número: " + numero2);
                    System.out.println("Soma: " + numero1 + " + " + numero2 + " = " + soma);
                }
                
            } catch (ArithmeticException e) {
                System.out.println(" ERRO ARITMÉTICO: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println(" ERRO CRÍTICO NO PROGRAMA: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            // Sempre executa, mesmo em caso de exceção
            System.out.println("\n Limpando recursos...");
            if (scanner != null) {
                scanner.close();
            }
            System.out.println(" Programa finalizado com segurança.");
        }
    }
}
