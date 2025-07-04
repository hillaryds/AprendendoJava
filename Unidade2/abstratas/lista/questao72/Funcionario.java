package abstratas.lista.questao72;

public class Funcionario {
    private String nome;
    private double salarioPorHora;


    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalarioMensal(int horasTrabalhadas) {
        return salarioPorHora * horasTrabalhadas;
    }

    public String toString() {
        return "Funcionário: " + nome + ", Salário por hora: R$" + String.format("%.2f", salarioPorHora);
    }
}