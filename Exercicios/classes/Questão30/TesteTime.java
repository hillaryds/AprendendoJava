package Exercicios.classes.Questão30;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Tigres FC", "Carlos Silva");

        time.registrarVitoria(3, 1);
        time.registrarEmpate(2, 2);
        time.registrarDerrota(1, 4);

        time.exibirResumo();
    }
}