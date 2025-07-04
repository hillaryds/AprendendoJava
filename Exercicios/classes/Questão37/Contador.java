/*37. Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada.*/
package Exercicios.classes.Questão37;

public class Contador {
    private int valor;

    // Construtor
    public Contador() {
        valor = 0;
    }
    // Zera o contador
    public void zerar() {
        valor = 0;
    }
    // Incrementa o contador
    public void incrementar() {
        valor++;
    }
    // Imprime o valor atual do contador
    public void imprimir() {
        System.out.println("Valor do contador: " + valor);
    }
}