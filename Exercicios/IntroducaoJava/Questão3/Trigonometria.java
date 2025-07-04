package Exercicios.IntroducaoJava.Questão3;

/*Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.
*/
import java.util.Scanner;
public class Trigonometria{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do ângulo em grau: ");
        double grau = scanner.nextDouble();
        double radiano = Math.toRadians(grau);

        System.out.printf("Seno: %.3f%n", Math.sin(radiano));
        System.out.printf("Cosseno: %.3f%n", Math.cos(radiano));
        System.out.printf("Tangente: %.3f%n", Math.tan(radiano));
        System.out.printf("Cotangente: %.3f%n", 1 / Math.tan(radiano));
        System.out.printf("Cossecante: %.3f%n", 1 / Math.sin(radiano));
        System.out.printf("Secante: %.3f%n", 1 / Math.cos(radiano));

        scanner.close();
    }
}