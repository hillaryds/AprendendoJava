package Reuso.lista.questao65;

public class Administrativo extends Assistente {
    private String turno; // "dia" ou "noite"
    private double adicionalNoturno;

    public Administrativo(String nome, Double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual() {
        // Adicional noturno só para 12 salários, não para o 13º
        if (turno.equalsIgnoreCase("noite")) {
            return (getSalario() + adicionalNoturno) * 12 + getSalario();
        } else {
            return super.ganhoAnual();
        }
    }

    public String toString() {
        return super.toString() + " | Turno: " + turno + " | Adicional Noturno: R$" + String.format("%.2f", adicionalNoturno);
    }
}
