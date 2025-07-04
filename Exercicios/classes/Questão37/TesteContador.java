package Exercicios.classes.Questão37;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.imprimir();    // Deve mostrar 0
        contador.incrementar();
        contador.incrementar();
        contador.imprimir();    // Deve mostrar 2
        contador.zerar();
        contador.imprimir();    // Deve mostrar 0
    }
}
