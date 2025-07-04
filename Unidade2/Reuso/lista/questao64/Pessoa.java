package Reuso.lista.questao64;
public class Pessoa{
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + nome + "| Idade: " + idade + "|";
    }


}