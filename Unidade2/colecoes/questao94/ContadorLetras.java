package colecoes.questao94;

import java.util.Map;
import java.util.TreeMap;

public class ContadorLetras {
    public static void main(String[] args) {
        // String de exemplo do enunciado
        String texto = "HELLO THERE";
        
        System.out.println("Texto analisado: \"" + texto + "\"");
        System.out.println();
        
        // Usando TreeMap para manter a ordem alfabética automaticamente
        Map<Character, Integer> contadorLetras = new TreeMap<>();
        
        // Percorrendo cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            // Ignorando espaços em branco
            if (letra != ' ') {
                // Convertendo para maiúscula para padronizar
                letra = Character.toUpperCase(letra);
                
                // Verificando se a letra já existe no mapa
                if (contadorLetras.containsKey(letra)) {
                    // Se existe, incrementa o contador
                    int contadorAtual = contadorLetras.get(letra);
                    contadorLetras.put(letra, contadorAtual + 1);
                } else {
                    // Se não existe, adiciona com contador 1
                    contadorLetras.put(letra, 1);
                }
            }
        }
        
        // Exibindo os resultados em ordem alfabética
        System.out.println("Contagem de letras (ordem alfabética):");
        System.out.println("=====================================");
        
        for (Map.Entry<Character, Integer> entrada : contadorLetras.entrySet()) {
            char letra = entrada.getKey();
            int quantidade = entrada.getValue();
            
            String plural = quantidade == 1 ? "" : "s";
            System.out.println(letra + ": " + quantidade + " ocorrência" + plural);
        }
        
        System.out.println("\n=== TESTE COM OUTRAS STRINGS ===");
        
        // Testando com outras strings
        String[] testesAdicionais = {
            "JAVA PROGRAMMING",
            "ESTRUTURA DE DADOS",
            "ALGORITMOS E LOGICA"
        };
        
        for (String teste : testesAdicionais) {
            System.out.println("\nTexto: \"" + teste + "\"");
            Map<Character, Integer> resultado = contarLetras(teste);
            exibirResultado(resultado);
        }
    }
    
    // Método auxiliar para contar letras em uma string
    public static Map<Character, Integer> contarLetras(String texto) {
        Map<Character, Integer> mapa = new TreeMap<>();
        
        for (char c : texto.toCharArray()) {
            if (c != ' ') {
                char letra = Character.toUpperCase(c);
                
                // Usando o método getOrDefault para simplificar
                mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
            }
        }
        
        return mapa;
    }
    
    // Método auxiliar para exibir o resultado formatado
    public static void exibirResultado(Map<Character, Integer> contadorLetras) {
        for (Map.Entry<Character, Integer> entrada : contadorLetras.entrySet()) {
            System.out.printf("%c: %d%n", entrada.getKey(), entrada.getValue());
        }
    }
}
