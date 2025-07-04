package Exercicios.classes.Questão41;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0; // campo estático para contar matrículas
    private int matricula;
    private String nome;
    private String curso;
    public RegistroAcademico(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        numeroDeMatriculas++; // incrementa ao criar nova instância
        this.matricula = numeroDeMatriculas; // atribui matrícula única
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getCurso() {
        return curso;
    }
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Curso: " + curso;
    }
}