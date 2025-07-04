package Exercicios.classes.Questão36;

public class TesteElevador{
    public static void main(String[]args){
        Elevador elevador = new Elevador(5, 4 );
        elevador.sobe();
        elevador.desce();
        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.sai();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sai();

    }
}