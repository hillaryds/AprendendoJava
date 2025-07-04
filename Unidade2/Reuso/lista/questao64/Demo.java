package Reuso.lista.questao64;
public class Demo{
    public static void main(String[]args){
        Governador gov = new Governador("Fatima", 57, "PT", "RN");
        Prefeito pf = new Prefeito("Raimundo", 67, "PSDB", "Alexandria");

        System.out.println(gov);
        System.out.println(pf);
    }
}