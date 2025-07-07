package abstratas.lista.questao74;

import abstratas.lista.questao73.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private double x1, y1;
    private double x2, y2; 
    
    public Desenho(FiguraGeometrica figura1, double x1, double y1, 
                   FiguraGeometrica figura2, double x2, double y2) {
        this.figura1 = figura1;
        this.x1 = x1;
        this.y1 = y1;
        this.figura2 = figura2;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void apresenta() {
        System.out.println("=== DESENHO ===");
        System.out.println("Primeira figura:");
        System.out.println("Coordenadas: (" + x1 + ", " + y1 + ")");
        figura1.descricao();
        
        System.out.println("\nSegunda figura:");
        System.out.println("Coordenadas: (" + x2 + ", " + y2 + ")");
        figura2.descricao();
        System.out.println("===============\n");
    }
}
