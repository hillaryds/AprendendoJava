package Reuso.lista.questao65;

public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, Double salario, String matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Double ganhoAnual() {
        // 13 salários + bônus anual
        return super.ganhoAnual() + bonus;
    }

    public String toString() {
        return super.toString() + " | Bônus: R$" + String.format("%.2f", bonus);
    }
}