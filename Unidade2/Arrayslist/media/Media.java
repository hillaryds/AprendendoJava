package Unidade2.Arrayslist.media;

public class Media {
    public static void main(String[] args) {
        System.out.println("Média: " + media(7, 8, 9, 10));
        System.out.println("Média: " + media(5, 5, 7));
    }

    public static double media(double... numeros) {
        if (numeros.length == 0) return 0;
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }
}