package Reuso.lista.questao61;

public class TestaEquipamento {
    public static void main(String[]args){
        Computador pc = new Computador("eletronico", "Avell", "intel core i7", 1000);
        Equipamento eq = new Equipamento("eletrodomesticos", "Philco");

        System.out.println(pc);
        System.out.println(eq);

    }
}
