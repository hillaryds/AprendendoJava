public class Aviao extends Aereo{
    private String cadAviao;
    public Aviao(int capcidade, String cadANAC, String cadAviao) {
        super(capcidade, cadANAC);
        this.cadAviao = cadAviao;
    }
    @Override
    public String toString() {
        return super.toString() + ", cadAviao=" + cadAviao ;
    }

    public void moverFrente(){
        System.out.println("Aviao estah movendo pra frente");
    }
}