package execesoes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisaoInteira {
    // Método que retorna o resultado da divisão inteira
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = sc.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar um número inteiro.");
        } finally {
            sc.close();
        }
    }
}