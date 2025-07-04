package Exercicios.IntroducaoJava.Questão11;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia de fevereiro de 2015 (1 a 28): ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 28) {
            System.out.println("Dia inválido!");
        } else {
            String[] diasSemana = {
                "domingo", "segunda-feira", "terça-feira", "quarta-feira",
                "quinta-feira", "sexta-feira", "sábado"
            };
            int indice = (dia - 1) % 7;
            System.out.println(indice);
            System.out.println("O dia " + dia + " foi um " + diasSemana[indice] + ".");
        }

        scanner.close();
    }
}