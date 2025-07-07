package abstratas.lista.questao75;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int numeroDePaginas;
    protected int anoDaEdicao;
    
    // Construtor
    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }
    
    // Método qualTitulo - retorna o título do livro
    public String qualTitulo() {
        return titulo;
    }
    
    // Método qualAutor - retorna o autor do livro
    public String qualAutor() {
        return autor;
    }
    
    // Método toString - retorna os valores dos campos em formato textual
    @Override
    public String toString() {
        return "Livro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", numeroDePaginas=" + numeroDePaginas +
               ", anoDaEdicao=" + anoDaEdicao +
               '}';
    }
}
