 package Reuso.lista.questao61;

public class Computador extends Equipamento{
    private String processador;
    private int memoriaGB;

    Computador(String t, String m, String p, int mem){
        super(t, m);
        this.processador = p;
        this.memoriaGB = mem;
    }

    public String getProcessador(){
        return processador;
    }
        
    public int getMemoriaGB(){
        return memoriaGB;
    }

    public void setProcessador(String p){
        this.processador = p;
        
    }

    public void setMemoriaGB(int mem){
        this.memoriaGB =  mem;
    }

    public String toString(){
        return super.toString() + " Processador: " + processador + "| Memoria em GB: " + memoriaGB + " |";
    }


}