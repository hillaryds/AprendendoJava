package Reuso.lista.questao64;
public class Politico extends Pessoa{
    private String partido;

    Politico(String nome, int idade, String partido){
        super(nome, idade);
        this.partido = partido;
    }

    public String toString(){
        return super.toString() + " Partido: " + partido + "|";
    }
}