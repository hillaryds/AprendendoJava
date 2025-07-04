package Exercicios.classes.Questão40;

public class TesteMaiorValor {
    public static void main(String[] args) {
        System.out.println("Maior entre 3 e 7 (int): " + MaiorValor.maior(3, 7));
        System.out.println("Maior entre 2, 8, 5 (int): " + MaiorValor.maior(2, 8, 5));
        System.out.println("Maior entre 1, 4, 9, 6 (int): " + MaiorValor.maior(1, 4, 9, 6));
        System.out.println("Maior entre 10, 3, 7, 2, 8 (int): " + MaiorValor.maior(10, 3, 7, 2, 8));

        System.out.println("Maior entre 2.5 e 7.3 (double): " + MaiorValor.maior(2.5, 7.3));
        System.out.println("Maior entre 1.1, 3.3, 2.2 (double): " + MaiorValor.maior(1.1, 3.3, 2.2));
        System.out.println("Maior entre 4.4, 2.2, 8.8, 5.5 (double): " + MaiorValor.maior(4.4, 2.2, 8.8, 5.5));
        System.out.println("Maior entre 7.7, 3.3, 9.9, 1.1, 6.6 (double): " + MaiorValor.maior(7.7, 3.3, 9.9, 1.1, 6.6));
    }
}