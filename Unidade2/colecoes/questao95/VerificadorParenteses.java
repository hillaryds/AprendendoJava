package colecoes.questao95;

import java.util.Stack;

public class VerificadorParenteses {
    public static void main(String[] args) {
        // Strings de teste do enunciado
        String[] expressoesBalanceadas = {
            "(()()()())",
            "(((())))",
            "(()((())()))"
        };
        
        String[] expressoesNaoBalanceadas = {
            "((((((())",
            "())",
            "(()()(())"
        };
        
        System.out.println("=== VERIFICADOR DE PARÊNTESES BALANCEADOS ===");
        System.out.println("(Usando estrutura de dados PILHA)\n");
        
        // Testando expressões balanceadas
        System.out.println(" EXPRESSÕES BALANCEADAS:");
        for (String expressao : expressoesBalanceadas) {
            boolean resultado = verificarBalanceamento(expressao);
            System.out.println("\"" + expressao + "\" → " + 
                             (resultado ? " BALANCEADA" : " NÃO BALANCEADA"));
        }
        
        System.out.println("\n EXPRESSÕES NÃO BALANCEADAS:");
        for (String expressao : expressoesNaoBalanceadas) {
            boolean resultado = verificarBalanceamento(expressao);
            System.out.println("\"" + expressao + "\" → " + 
                             (resultado ? " BALANCEADA" : " NÃO BALANCEADA"));
        }
        
        // Demonstração passo a passo
        System.out.println("\n=== DEMONSTRAÇÃO PASSO A PASSO ===");
        demonstrarPassoAPasso("(()())");
        demonstrarPassoAPasso("((())");
    }
    
    /**
     * Verifica se uma string de parênteses está balanceada usando uma pilha
     * @param expressao String contendo apenas '(' e ')'
     * @return true se balanceada, false caso contrário
     */
    public static boolean verificarBalanceamento(String expressao) {
        // Criando uma pilha para armazenar os parênteses de abertura
        Stack<Character> pilha = new Stack<>();
        
        // Percorrendo cada caractere da expressão
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            
            if (caractere == '(') {
                // Parênteses de abertura: empilha na pilha
                pilha.push(caractere);
                
            } else if (caractere == ')') {
                // Parênteses de fechamento: verifica se há um '(' correspondente
                if (pilha.isEmpty()) {
                    // Não há '(' para fechar este ')'
                    return false;
                }
                // Remove um '(' da pilha (encontrou o par)
                pilha.pop();
            }
        }
        
        // Se a pilha estiver vazia, todos os parênteses foram balanceados
        return pilha.isEmpty();
    }
    
    /**
     * Demonstra o funcionamento do algoritmo passo a passo
     * @param expressao String para demonstrar
     */
    public static void demonstrarPassoAPasso(String expressao) {
        System.out.println("\n Analisando: \"" + expressao + "\"");
        System.out.println("Passo | Char | Ação | Estado da Pilha");
        System.out.println("------|------|------|----------------");
        
        Stack<Character> pilha = new Stack<>();
        boolean balanceada = true;
        
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            String acao = "";
            
            if (caractere == '(') {
                pilha.push(caractere);
                acao = "Empilha '('";
            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    acao = " Erro: pilha vazia";
                    balanceada = false;
                } else {
                    pilha.pop();
                    acao = "Desempilha '('";
                }
            }
            
            System.out.printf(" %2d   |  %c   | %-15s | %s%n", 
                            i + 1, caractere, acao, pilha.toString());
        }
        
        System.out.println("\n Resultado: " + 
                          (balanceada && pilha.isEmpty() ? " BALANCEADA" : " NÃO BALANCEADA"));
        
        if (!pilha.isEmpty()) {
            System.out.println("   Motivo: Sobraram " + pilha.size() + " '(' sem fechamento");
        }
    }
}
