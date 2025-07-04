public class DemoUniversidade {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico("Carla", "4002", "LTI");
        RegistroAcademicoPosGraduacao p1 = new RegistroAcademicoPosGraduacao(r1, "AAAA", "Italo");
        System.out.println(p1);

        RegistroAcademicoPosGraduacao p2 = new RegistroAcademicoPosGraduacao("Ana", "4005", "ARQ", 
                                                                              "BBBBBB", "Itala");
        
        System.out.println(p2);
    }
}
