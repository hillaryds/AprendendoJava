package Exercicios.IntroducaoJava.Questão5;
/* Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável
de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.*/

public class TransformarNumeros{
    public static void main(String[]args){
        int numero = 895;
        int centena = numero / 100;
        int dezena = (numero /10) %10;
        int unidade = (numero % 10);

        int numeroFormatado = (unidade *100) + (dezena * 10) + centena;
        System.out.println(numeroFormatado);

    }
}