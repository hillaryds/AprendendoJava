package Exercicios.classes.Questão42;

public class Trio<T> {
    private T primeiro;
    private T segundo;
    private T terceiro;
    public Trio(T primeiro, T segundo, T terceiro) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }
    // Método que diz quantos dos 3 atributos são iguais
    public int quantosIguais() {
        int iguais = 1;
        if (primeiro.equals(segundo) && segundo.equals(terceiro)) {
            iguais = 3;
        } else if (primeiro.equals(segundo) || primeiro.equals(terceiro) || segundo.equals(terceiro)) {
            iguais = 2;
        }
        return iguais;
    }
    // Método que imprime os 3 atributos
    public void imprimir() {
        System.out.println("Primeiro: " + primeiro + ", Segundo: " + segundo + ", Terceiro: " + terceiro);
    }
}