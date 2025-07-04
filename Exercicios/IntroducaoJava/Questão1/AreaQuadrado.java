package Exercicios.IntroducaoJava.Questão1;

/* 
Escreva um programa que calcule a área de um quadrado.
 O valor do lado de um quadrado deverá ser informado pelo usuário.
*/

import java.util.Scanner;

public class AreaQuadrado{
	public static void main (String[]args){
		float lado;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		lado = scanner.nextFloat();
		System.out.println("O valor da area eh de: " + lado*lado);
		scanner.close();
	}
}
