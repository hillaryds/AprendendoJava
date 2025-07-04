package Exercicios.IntroducaoJava.Questão20;

// Questão 20
import java.util.Scanner;

public class MDCRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite m: ");
        int m = sc.nextInt();
        System.out.print("Digite n: ");
        int n = sc.nextInt();

        System.out.println("MDC: " + mdc(m, n));
        sc.close();
    }

    public static int mdc(int m, int n) {
        if (n > m)
            return mdc(n, m);
        if (n == 0)
            return m;
        return mdc(n, m % n);
    }
}