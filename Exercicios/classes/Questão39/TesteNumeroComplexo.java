package Exercicios.classes.Questão39;

public class TesteNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(2, 4);
        NumeroComplexo n2 = new NumeroComplexo(5);
        NumeroComplexo n3 = new NumeroComplexo();

        System.out.println("n1: " + n1); // 2.00 + 4.00i
        System.out.println("n2: " + n2); // 5.00
        System.out.println("n3: " + n3); // 0.00
    }
}