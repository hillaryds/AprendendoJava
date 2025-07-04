package Unidade2.Arrayslist.pascal;

public class Pascal {
    private int[][] triangulo;

    public Pascal(int linhas) {
        triangulo = new int[linhas][];
        for (int i = 0; i < linhas; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                sb.append(triangulo[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}