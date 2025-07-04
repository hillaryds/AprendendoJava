public  abstract class Aquatico extends Veiculo{
    private float profundidade;

    public Aquatico(int capacidade, float profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", profundidade=" + profundidade ;
    }

    
}
