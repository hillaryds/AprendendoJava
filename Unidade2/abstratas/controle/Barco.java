public class Barco extends Aquatico {
    private String cadBarco;
    public Barco(int capacidade, float profundidade, String cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }
    @Override
    public String toString() {
        return super.toString() + ", cadBarco=" + cadBarco ;
    }
    
    public void moverFrente(){
        System.out.println("Barco estah movendo pra frente");
    }
    
}
