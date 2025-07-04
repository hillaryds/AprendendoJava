public class Aula16Operadoresrelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Operador de igualdade (==)
        boolean igual = a == b; // verifica se a é igual a b
        System.out.println("a == b: " + igual); // false

        // Operador de diferença (!=)
        boolean diferente = a != b; // verifica se a é diferente de b
        System.out.println("a != b: " + diferente); // true

        // Operador maior que (>)
        boolean maior = a > b; // verifica se a é maior que b
        System.out.println("a > b: " + maior); // false

        // Operador menor que (<)
        boolean menor = a < b; // verifica se a é menor que b
        System.out.println("a < b: " + menor); // true

        // Operador maior ou igual (>=)
        boolean maiorOuIgual = a >= b; // verifica se a é maior ou igual a b
        System.out.println("a >= b: " + maiorOuIgual); // false

        // Operador menor ou igual (<=)
        boolean menorOuIgual = a <= b; // verifica se a é menor ou igual a b
        System.out.println("a <= b: " + menorOuIgual); // true
    }
}
