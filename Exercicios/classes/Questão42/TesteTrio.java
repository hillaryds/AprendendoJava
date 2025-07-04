package Exercicios.classes.Questão42;

public class TesteTrio {
    public static void main(String[] args) {
        Trio<Integer> trioInt = new Trio<>(1, 2, 1);
        Trio<String> trioStr = new Trio<>("aac", "abc", "abc");
        Trio<Double> trioDouble = new Trio<>(2.5, 3.5, 4.5);
        trioInt.imprimir();
        System.out.println("Iguais: " + trioInt.quantosIguais());
        trioStr.imprimir();
        System.out.println("Iguais: " + trioStr.quantosIguais());
        trioDouble.imprimir();
        System.out.println("Iguais: " + trioDouble.quantosIguais());
    }
}