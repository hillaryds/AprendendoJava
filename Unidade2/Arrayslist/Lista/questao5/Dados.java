package Arrayslist.Lista.questao5;

/*Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
 um objeto da classe Random, uma vez para lançar o primeiro dado e novamente para
 lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
 pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
 aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
 contar o número de vezes que cada possível soma aparece. Exiba os resultados.*/

import java.util.Random;
public class Dados{
    public static void main(String[]args){
        Random random = new Random();
        int [] frequencias = new int[13]; //indice de 0 a 12
        int lancamentos = 36_000_000;

        for (int i = 0; i < lancamentos; i++){
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            frequencias[dado1 + dado2]++;
        }

        System.out.println("Soma\tFrequencia");
        for(int soma = 2; soma <=12; soma ++){
            System.out.println(soma + "\t" + frequencias[soma]);
        }
    }
}