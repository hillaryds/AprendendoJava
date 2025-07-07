package abstratas.lista.questao75;

public interface ItemDeBiblioteca {
    // Campo constante para máximo de dias para empréstimo
    int maximoDeDiasParaEmprestimo = 14;
    
    // Métodos da interface
    boolean estaEmprestado();
    void empresta();
    void devolve();
    String localizacao();
    String descricao();
}
