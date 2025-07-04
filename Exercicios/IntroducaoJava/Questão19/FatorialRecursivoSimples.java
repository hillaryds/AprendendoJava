package Exercicios.IntroducaoJava.Questão19;

// Questão 19 - Fatorial Recursivo com Saída Formatada (Segundo Estilo)
import java.util.Scanner;

public class FatorialRecursivoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo (n): ");
        int n = sc.nextInt();
        sc.close();

        // Chamada do fatorial para exibir todos os valores de 0 até n
        for (int i = 0; i <= n; i++) {
            int resultado = fatorial(i);
            System.out.println(i + "! = " + resultado);
        }
    }

    // Função recursiva para calcular o fatorial
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
