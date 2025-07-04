package Exercicios.classes.Questão38;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.mostraEstado(); // Apagada
        lampada.acende();
        lampada.mostraEstado(); // Acesa
        lampada.apaga();
        lampada.mostraEstado(); // Apagada
        lampada.acende();
        lampada.mostraEstado(); // Acesa
        lampada.mostrarQuantidadeAcesa(); // Deve mostrar 2
    }
}