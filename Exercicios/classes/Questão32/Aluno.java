
/*32. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). 
/*Escreva os seguintes métodos
para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 
• provaFinal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
*/

public class Aluno{
    private int matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double notaTrabalho;
    
    Aluno(int matricula, String nome, double p1, double p2, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = p1;
        this.prova2 = p2;
        this.notaTrabalho = notaTrabalho;

    }

    public double media(){
        return (prova1 * 2.5 + prova2 * 2.5 + notaTrabalho * 2)/7;
    }

    public int provaFinal(double media){
        if (media  < 3 || media >= 7){
            return 0;
        }else{
            return 1;
        }
    }

    public double mediaFinal(double exFinal, double media){
        return (media * 6 + exFinal * 4)/10;
    }


}







