package colecoes.questao96;

public class Paciente {
    private String rg;
    private int idade;
    
    public Paciente(String rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }
    
    public String getRg() {
        return rg;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public boolean ehIdoso() {
        return idade > 60;
    }
    
    @Override
    public String toString() {
        return "Paciente{RG='" + rg + "', idade=" + idade + 
               (ehIdoso() ? " (PRIORITÁRIO)" : " (COMUM)") + "}";
    }
}
