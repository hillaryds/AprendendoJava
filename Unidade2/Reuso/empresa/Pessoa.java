package Reuso.empresa;

public class Pessoa {
    private String nome;
    private String identidade;

    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", identidade=" + identidade + "]";
    }

    
}
