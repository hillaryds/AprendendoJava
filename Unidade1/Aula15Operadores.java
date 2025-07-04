public class Aula15Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        // Soma (+)
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma); // 10 + 20 = 30

        // Subtração (-)
        int subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao); // 10 - 20 = -10

        // Multiplicação (*)
        int multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao); // 10 * 20 = 200

        // Divisão (/)
        int divisao = numero2 / numero1;
        System.out.println("Divisão: " + divisao); // 20 / 10 = 2

        // Módulo (%): resto da divisão
        int modulo = numero2 % numero1;
        System.out.println("Módulo: " + modulo); // 20 % 10 = 0

        // Operadores de incremento e decremento
        int incremento = numero1;
        incremento++; // incremento = incremento + 1
        System.out.println("Incremento: " + incremento); // 11

        int decremento = numero2;
        decremento--; // decremento = decremento - 1
        System.out.println("Decremento: " + decremento); // 19
    }
}