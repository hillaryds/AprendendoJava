/*Escreva uma classe que encapsule uma matriz de tamanho 2×2 de valores do tipo float
 usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
 método que calcule o determinante da matriz encapsulada e um método que permita a
 impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
 demonstre as capacidades da classe criada.*/
package Arrayslist.Lista.questao2;
public class Matriz{
    private float [][] matriz2x2;

    Matriz(float p, float s, float t, float q){
        matriz2x2 = new float[2][2];
        matriz2x2[0][0] = p;
        matriz2x2[0][1] = s;
        matriz2x2[1][0] = t;
        matriz2x2[1][1] = q;
    }

    public float calculaDeterminate(){
        return (matriz2x2[0][0] * matriz2x2[0][1] ) - (matriz2x2[1][0] * matriz2x2[1][1]);
    }

   public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < matriz2x2.length; i++){
            for (int j = 0; j < matriz2x2[i].length; j++) {
                sb.append(matriz2x2[i][j]).append(" ");
            } 
            sb.append("\n");
        }
        return sb.toString();
    } 

    
}