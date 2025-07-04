package Reuso.lista.questao61;
public class Equipamento{
    private String tipo;
    private String marca;

    Equipamento(String t, String m){
        this.tipo = t;
        this.marca = m;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getMarca(){
        return this.marca;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public String toString(){
        return "| Tipo: " + this.tipo + "| Marca: " + this.marca + "|" ;
    }
}