
package Reuso.lista.questao65;

public class Funcionario{
    private String nome;
    private Double salario;

    Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(Double aumento){
        this.salario += aumento;
    }

     public double ganhoAnual() {
        return salario * 13;
    }

    public String toString() {
        return "Nome: " + nome + "| Salario: R$" + String.format("%.2f", salario);
    }

    public Double getSalario(){
        return salario;
    }
}