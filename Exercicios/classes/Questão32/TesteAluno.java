

public class TesteAluno{
    public static void main(String[]args){
        Aluno aluno = new Aluno(400289, "Hillary", 9.5, 7, 5);
        double media = aluno.media();
        System.out.println("A media do aluno foi de: " + media);
        if (aluno.provaFinal(media) == 1){
            double exameFinal = 8;
            System.out.println("A media final do aluno eh de: " + aluno.mediaFinal(exameFinal, media));
        }else if (media < 3){
            System.out.println("Aluno reprovado");
        }else{
            System.out.println("Nao necessita de final, passou por média");
        }
    }
}