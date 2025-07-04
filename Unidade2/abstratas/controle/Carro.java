public class Carro extends Terrestre{
    private String placa;
    public Carro(int capacidade, int qtdRodas, String placa) {
        super(capacidade, qtdRodas);
        this.placa = placa;
    }
    @Override
    public String toString() {
        return super.toString() + ", placa=" + placa;
    }

    public void moverFrente(){
        System.out.println("Carro estah movendo pra frente");
    }
    
}
