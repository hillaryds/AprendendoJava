package abstratas.lista.questao75;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacaoBiblioteca;
    
    // Construtor
    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, 
                           int anoDaEdicao, String localizacaoBiblioteca) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false; // Inicialmente não está emprestado
        this.localizacaoBiblioteca = localizacaoBiblioteca;
    }
    
    // Implementação dos métodos da interface ItemDeBiblioteca
    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }
    
    @Override
    public void empresta() {
        emprestado = true;
        System.out.println("Livro '" + titulo + "' foi emprestado.");
    }
    
    @Override
    public void devolve() {
        emprestado = false;
        System.out.println("Livro '" + titulo + "' foi devolvido.");
    }
    
    @Override
    public String localizacao() {
        return localizacaoBiblioteca;
    }
    
    @Override
    public String descricao() {
        return "Livro: " + titulo + " - Autor: " + autor + " (" + anoDaEdicao + ")";
    }
    
    // Método toString específico para LivroDeBiblioteca
    @Override
    public String toString() {
        return "LivroDeBiblioteca{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", numeroDePaginas=" + numeroDePaginas +
               ", anoDaEdicao=" + anoDaEdicao +
               ", emprestado=" + emprestado +
               ", localizacao='" + localizacaoBiblioteca + '\'' +
               ", maximoDeDiasParaEmprestimo=" + maximoDeDiasParaEmprestimo +
               '}';
    }
}
