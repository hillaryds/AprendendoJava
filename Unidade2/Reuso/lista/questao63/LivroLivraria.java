package Reuso.lista.questao63;

public class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    public LivroLivraria(String titulo, String autor, int ano, double preco, int estoque) {
        super(titulo, autor, ano);
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    public String toString() {
        return super.toString() + " Preço: R$" + preco + "| Estoque: " + estoque;
    }
}