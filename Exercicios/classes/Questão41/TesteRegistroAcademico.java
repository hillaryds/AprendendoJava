package Exercicios.classes.Questão41;

public class TesteRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("Ana", "Engenharia");
        RegistroAcademico aluno2 = new RegistroAcademico("Bruno", "Medicina");
        RegistroAcademico aluno3 = new RegistroAcademico("Carla", "Direito");

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}