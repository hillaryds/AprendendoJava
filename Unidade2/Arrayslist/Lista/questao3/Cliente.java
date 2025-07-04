package Arrayslist.Lista.questao3;

/*Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone. 
Faça um programa para solicitar os dados de vários clientes e armazenar em umArrayList 
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes.*/

public class Cliente{
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int i, String t){
        this.id = id;
        this.nome = nome;
        this.idade = i;
        this.telefone = t;
    }

    public String toString(){
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }
    
}