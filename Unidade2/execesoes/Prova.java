package execesoes;

public class Prova {
    public static void main(String[] args) {
        int respostas[] = {0, 1, 2, 3, 4, 5, 4, 14, 2, 1};
        int contador [] = new int[6];

        for(int i =0; i < contador.length; i++){
            contador[i] = 0;

        }

        for (int resp : respostas){
            try{
                contador[resp]++;
            } catch (ArrayIndexOutOfBoundsException excecao){
                System.out.println("Ocorreu uma excecao");

            }
            

        }

        for( int i = 0; i < contador.length; i++){
            System.out.println("A resposta "  + i + " ocorreu " + contador[i] + " vezes");
        }

    }
}
