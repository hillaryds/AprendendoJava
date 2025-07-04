/*Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. 
Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? 
Escreva um aplicativo de teste que demonstre as capacidades da
classe criada. */


package Exercicios.classes.Questão30;

// Classe que representa um time de futebol em um campeonato
public class Time {
    private String nome;
    private String tecnico;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;

    // Construtor
    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    // Métodos para registrar resultados
    public void registrarVitoria(int golsFeitos, int golsLevados) {
        vitorias++;
        golsMarcados += golsFeitos;
        golsSofridos += golsLevados;
    }

    public void registrarEmpate(int golsFeitos, int golsLevados) {
        empates++;
        golsMarcados += golsFeitos;
        golsSofridos += golsLevados;
    }

    public void registrarDerrota(int golsFeitos, int golsLevados) {
        derrotas++;
        golsMarcados += golsFeitos;
        golsSofridos += golsLevados;
    }

    public int getPontos() {
        return vitorias * 3 + empates;
    }

    public int getSaldoGols() {
        return golsMarcados - golsSofridos;
    }

    public void exibirResumo() {
        System.out.println("Time: " + nome);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Gols marcados: " + golsMarcados);
        System.out.println("Gols sofridos: " + golsSofridos);
        System.out.println("Saldo de gols: " + getSaldoGols());
        System.out.println("Pontos: " + getPontos());
    }
}