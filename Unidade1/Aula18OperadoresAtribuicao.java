public class Aula18OperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 10; // atribuição simples (=)
        System.out.println("Valor inicial: " + numero); // 10

        // Soma e atribuição (+=)
        numero += 5; // equivalente a: numero = numero + 5;
        System.out.println("Após += 5: " + numero); // 15

        // Subtração e atribuição (-=)
        numero -= 3; // equivalente a: numero = numero - 3;
        System.out.println("Após -= 3: " + numero); // 12

        // Multiplicação e atribuição (*=)
        numero *= 2; // equivalente a: numero = numero * 2;
        System.out.println("Após *= 2: " + numero); // 24

        // Divisão e atribuição (/=)
        numero /= 4; // equivalente a: numero = numero / 4;
        System.out.println("Após /= 4: " + numero); // 6

        // Módulo e atribuição (%=)
        numero %= 4; // equivalente a: numero = numero % 4;
        System.out.println("Após %= 4: " + numero); // 2

        // Atribuição com String
        String texto = "Olá";
        texto += " Mundo!"; // equivalente a: texto = texto + " Mundo!";
        System.out.println("Texto final: " + texto); // Olá Mundo!
    }
}