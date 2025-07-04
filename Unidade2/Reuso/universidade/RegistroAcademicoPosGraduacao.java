public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTeste;
    private String orientador;

    public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTeste, String orientador) {
        this.registro = registro;
        this.tituloTeste = tituloTeste;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(String nome, String matricula, String curso, String tituloTeste, String orientador) {
        this.registro = new RegistroAcademico(nome, matricula, curso);
        this.tituloTeste = tituloTeste;
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "RegistroAcademicoPosGraduacao [registro=" + registro + ", tituloTeste=" + tituloTeste + ", orientador="
                + orientador + "]";
    }    
    
}
