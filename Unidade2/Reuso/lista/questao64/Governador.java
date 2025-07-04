package Reuso.lista.questao64;
public class Governador extends Politico{
    private String estado;

    Governador(String nome, int idade, String partido, String estado){
        super(nome, idade, partido);
        this.estado = estado;
    }

    public String toString(){
        return super.toString() + " Estado: " + estado + "|";
    }
}