package execesoes.lista.questao103;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MesesDoAnoAvancado {
    
    private static Scanner scanner = new Scanner(System.in);
    
    // Vetor com os nomes dos meses do ano
    private static final String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };
    
    /**
     * Método para obter um número inteiro válido
     * @return número inteiro digitado pelo usuário
     */
    public static int obterNumeroValido() {
        while (true) {
            try {
                System.out.print("Digite o número do mês (1-12) ou 0 para sair: ");
                int numero = scanner.nextInt();
                return numero;
                
            } catch (InputMismatchException e) {
                System.out.println(" ERRO: '" + scanner.next() + "' não é um número válido!");
                System.out.println("   Por favor, digite apenas números inteiros.");
                
            } catch (Exception e) {
                System.out.println(" ERRO INESPERADO: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Método para obter o nome do mês com tratamento de exceções
     * @param numeroMes número do mês (1-12)
     * @return nome do mês correspondente
     * @throws ArrayIndexOutOfBoundsException se o número estiver fora do intervalo
     */
    public static String obterNomeMes(int numeroMes) throws ArrayIndexOutOfBoundsException {
        if (numeroMes < 1 || numeroMes > 12) {
            throw new ArrayIndexOutOfBoundsException("Mês deve estar entre 1 e 12. Valor digitado: " + numeroMes);
        }
        return meses[numeroMes - 1];
    }
    
    /**
     * Método que exibe todos os meses disponíveis
     */
    public static void exibirMesesDisponiveis() {
        System.out.println("\n MESES DISPONÍVEIS:");
        for (int i = 0; i < meses.length; i++) {
            System.out.println("   " + (i + 1) + " - " + meses[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DOS MESES DO ANO (VERSÃO AVANÇADA) ===");
        System.out.println("Este programa mostra o nome do mês correspondente ao número digitado.");
        
        // Mostra os meses disponíveis
        exibirMesesDisponiveis();
        
        boolean continuar = true;
        int tentativas = 0;
        final int MAX_TENTATIVAS = 5;
        
        while (continuar && tentativas < MAX_TENTATIVAS) {
            try {
                int numeroMes = obterNumeroValido();
                
                // Verifica se o usuário quer sair
                if (numeroMes == 0) {
                    System.out.println(" Saindo do programa...");
                    break;
                }
                
                // Tenta obter o nome do mês
                String nomeMes = obterNomeMes(numeroMes);
                
                System.out.println(" RESULTADO: Mês " + numeroMes + " corresponde a " + nomeMes);
                System.out.println();
                
                // Pergunta se quer continuar
                System.out.print("Deseja consultar outro mês? (s/n): ");
                scanner.nextLine(); // Limpa o buffer
                String resposta = scanner.nextLine().toLowerCase();
                
                if (!resposta.equals("s") && !resposta.equals("sim")) {
                    continuar = false;
                }
                
                tentativas = 0; // Reseta tentativas após sucesso
                
            } catch (ArrayIndexOutOfBoundsException e) {
                tentativas++;
                System.out.println(" ERRO DE ÍNDICE: " + e.getMessage());
                
                if (tentativas < MAX_TENTATIVAS) {
                    System.out.println(" Tentativa " + tentativas + " de " + MAX_TENTATIVAS);
                    System.out.println("   Dica: Digite um número entre 1 e 12.");
                    exibirMesesDisponiveis();
                } else {
                    System.out.println(" LIMITE DE TENTATIVAS EXCEDIDO!");
                }
                
            } catch (Exception e) {
                System.out.println(" ERRO CRÍTICO: " + e.getClass().getSimpleName() + 
                                 " - " + e.getMessage());
                e.printStackTrace();
                break;
            }
        }
        
        // Finalização
        try {
            scanner.close();
            System.out.println(" Programa finalizado com segurança!");
            
        } catch (Exception e) {
            System.out.println( "Erro ao finalizar programa: " + e.getMessage());
        }
    }
}
