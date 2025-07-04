package Reuso.lista.questao63;

public class LivroBiblioteca extends Livro {
    private String codigoCatalogacao;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, int ano, String codigoCatalogacao, boolean emprestado) {
        super(titulo, autor, ano);
        this.codigoCatalogacao = codigoCatalogacao;
        this.emprestado = emprestado;
    }

    public String getCodigoCatalogacao() { return codigoCatalogacao; }
    public boolean isEmprestado() { return emprestado; }

    public String toString() {
        return super.toString() + "| Código: " + codigoCatalogacao + "| Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}