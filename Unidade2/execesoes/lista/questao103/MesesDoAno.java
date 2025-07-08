package execesoes.lista.questao103;

import java.util.Scanner;

public class MesesDoAno {
    
    private static Scanner scanner = new Scanner(System.in);
    
    // Vetor com os nomes dos meses do ano
    private static final String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DOS MESES DO ANO ===");
        System.out.println("Digite um número de 1 a 12 para ver o mês correspondente.");
        System.out.println("Digite 0 para sair do programa.\n");
        
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.print("Digite o número do mês (1-12) ou 0 para sair: ");
                int numeroMes = scanner.nextInt();
                
                // Verifica se o usuário quer sair
                if (numeroMes == 0) {
                    System.out.println(" Saindo do programa...");
                    continuar = false;
                    continue;

                }
                
                String nomeMes = meses[numeroMes - 1];
                
                System.out.println(" Mês " + numeroMes + ": " + nomeMes);
                System.out.println();
                
                
            } catch (Exception e) {
                System.out.println(" ERRO INESPERADO: " + e.getClass().getSimpleName() + 
                                 " - " + e.getMessage());
                scanner.nextLine(); // Limpa o buffer
                System.out.println();
            }
        }
        
        // Fecha o scanner
        scanner.close();
        System.out.println(" Programa finalizado com sucesso!");
    }
}
