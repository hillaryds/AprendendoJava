package colecoes.questao95;

import java.util.Stack;

public class VerificadorParentesesSimples {
    
    public static boolean verificarBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();
        
        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        
        return pilha.isEmpty();
    }
    
    public static void main(String[] args) {
        // Teste com um exemplo de cada tipo
        String balanceada = "(()())";
        String naoBalanceada = "((()";
        
        System.out.println("=== VERIFICADOR DE PARÊNTESES ===");
        
        System.out.println("\nExpressão BALANCEADA:");
        System.out.println(balanceada + " - " + verificarBalanceamento(balanceada));
        
        System.out.println("\nExpressão NÃO BALANCEADA:");
        System.out.println(naoBalanceada + " - " + verificarBalanceamento(naoBalanceada));
    }
}
