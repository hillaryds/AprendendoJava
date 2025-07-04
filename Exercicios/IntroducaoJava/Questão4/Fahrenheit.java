package Exercicios.IntroducaoJava.Questão4;

/*Escreva um programa que receba uma temperatura em graus centígrados e a apresente
em graus Fahrenheit. (0 °C × 9/5) + 32 = 32 °F*/
import java.util.Scanner;
public class Fahrenheit{
    public static void main(String[]agrs){
        Scanner scanner = new Scanner(System.in);
        double celsius;
        System.out.print("Digite a temperatura em graus celsius: ");
        celsius = scanner.nextDouble();
        System.out.println("A temperatura em Fahrenheit eh de: " + ((celsius * 9/5) + 32));
        scanner.close();
        
    }
}