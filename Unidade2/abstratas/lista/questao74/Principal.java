package abstratas.lista.questao74;

import abstratas.lista.questao73.Circulo;
import abstratas.lista.questao73.Quadrado;
import abstratas.lista.questao73.Triangulo;

public class Principal {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(
            new Circulo(), 10.5, 20.3,
            new Quadrado(), 5.0, 15.7
        );
        
        Desenho desenho2 = new Desenho(
            new Quadrado(), 30.2, 45.8,
            new Triangulo(), 12.1, 8.9
        );
        
        System.out.println("PRIMEIRO DESENHO:");
        desenho1.apresenta();
        
        System.out.println("SEGUNDO DESENHO:");
        desenho2.apresenta();
    }
}
