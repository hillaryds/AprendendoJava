package colecoes.questao94;

import java.util.Map;
import java.util.TreeMap;

public class ContadorLetras {
    public static void main(String[] args) {
        // String de exemplo do enunciado
        // Testando com outras strings
        String teste = "HELLO THERE";
        
            System.out.println("\nTexto: \"" + teste + "\"");
            Map<Character, Integer> resultado = contarLetras(teste);
            exibirResultado(resultado);
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
