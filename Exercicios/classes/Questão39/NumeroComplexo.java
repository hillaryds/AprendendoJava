/*39. Escreva uma classe para representar um número complexo. Essa classe deve conter
três construtores. Um construtor deverá receber os dois valores (parte real e parte imaginária) como argumentos, o outro somente o valor real, considerando o imaginário como
sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
imaginária do número complexo como sendo iguais a zero. Escreva um método toString
que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
aplicativo de teste que demonstre as capacidades da classe criada. */

package Exercicios.classes.Questão39;

public class NumeroComplexo {
    private double real;
    private double imaginario;
    // Construtor 1: recebe parte real e imaginária
    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    // Construtor 2: recebe só a parte real, imaginária = 0
    public NumeroComplexo(double real) {
        this.real = real;
        this.imaginario = 0;
    }
    // Construtor 3: sem argumentos, ambos zero
    public NumeroComplexo() {
        this.real = 0;
        this.imaginario = 0;
    }
    public String toString() {
        if (imaginario == 0) {
            return String.format("%.2f", real);
        } else if (real == 0) {
            return String.format("%.2fi", imaginario);
        } else if (imaginario > 0) {
            return String.format("%.2f + %.2fi", real, imaginario);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginario);
        }
    }
}