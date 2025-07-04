package Reuso.lista.questao64;
public class Prefeito extends Politico{
    private String cidade;

    Prefeito(String nome, int idade, String partido, String cidade){
        super(nome, idade, partido);
        this.cidade = cidade;
    }

    public String toString(){
        return super.toString() + " Cidade: " + cidade + "|";
    }

}