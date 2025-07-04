package Exercicios.IntroducaoJava.Questão6;

/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.*/


public class DiasHorasMinutos{
    public static void main(String[]agrs){
        int tempoMinutos = 9257;
        int dias = tempoMinutos / 1440;
        int horas = (tempoMinutos % 1440) / 60;
        int minutos = tempoMinutos % 60;

        System.out.println(tempoMinutos + " = " + dias + " dias, " + horas + " horas, " + minutos + " minutos.");

    }
}