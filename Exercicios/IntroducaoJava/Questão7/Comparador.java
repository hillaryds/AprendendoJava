package Exercicios.IntroducaoJava.Questão7;
/*Escreva um programa que lê três números e determina qual número é o menor.*/

public class Comparador{
    public static void main (String[]args){
        int n1 = 7;
        int n2, n3;
        n3 = 1;
        n2 = 2;
        int menor;
        if (n1 >= n2 && n2 <= n3){
            menor = n2;
        } else if (n2 >= n3 && n3 <= n1){
            menor = n3;
        } else{
            menor = n1;
        }
        System.out.println(menor);
    }
}