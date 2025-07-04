package Exercicios.IntroducaoJava.Questão2;

/*Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
valores reais serão informados pelo usuário.*/

import java.util.Scanner; 
public class MediaAritmeetica{
	public static void main(String[]args){	
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, nota3;
		System.out.print("Informe a nota 1: ");
		nota1 = scanner.nextFloat();
		System.out.print("Informe a nota 2: ");
		nota2 = scanner.nextFloat();
		System.out.print("Informe a nota 3: ");
		nota3 = scanner.nextFloat();

		float soma = soma(nota1, nota2, nota3);

		System.out.println("A soma das notas eh de: " + soma);
		System.out.println("A media aritmética eh de: " + soma/3);

		scanner.close();
	
	

	}
	public static float soma( float a, float b, float c){
		return(a+b+c);
	}
}
