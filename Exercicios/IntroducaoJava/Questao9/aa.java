package Exercicios.IntroducaoJava.Questao9;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor da carta
        System.out.print("Digite o valor da carta (1 a 13): ");
        int valor = scanner.nextInt();

        // Lê o valor do naipe
        System.out.print("Digite o naipe (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipe = scanner.nextInt();

        String nomeCarta = "";
        String nomeNaipe = "";

        // Determina o nome da carta
        switch (valor) {
            case 1: nomeCarta = "Ás"; break;
            case 11: nomeCarta = "Valete"; break;
            case 12: nomeCarta = "Dama"; break;
            case 13: nomeCarta = "Rei"; break;
            default:
                if (valor >= 2 && valor <= 10) {
                    nomeCarta = String.valueOf(valor);
                } else {
                    nomeCarta = "Valor inválido";
                }
        }

        // Determina o nome do naipe
        switch (naipe) {
            case 1: nomeNaipe = "Ouros"; break;
            case 2: nomeNaipe = "Paus"; break;
            case 3: nomeNaipe = "Copas"; break;
            case 4: nomeNaipe = "Espadas"; break;
            default: nomeNaipe = "Naipe inválido";
        }

        // Exibe o resultado
        if (!nomeCarta.equals("Valor inválido") && !nomeNaipe.equals("Naipe inválido")) {
            System.out.println("Carta: " + nomeCarta + " de " + nomeNaipe);
        } else {
            System.out.println("Entrada inválida!");
        }

        scanner.close();
    }
}