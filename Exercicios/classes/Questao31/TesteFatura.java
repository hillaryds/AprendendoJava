package Exercicios.classes.Questao31;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1, "Mouse óptico", 3, 50.0);
        System.out.println("Total da fatura: " + fatura.calculaTotal());
    }
}