package Reuso.lista.questao62;

public class DemoEventos {
    public static void main(String[] args) {
        DataHora dh = new DataHora(2025, 7, 4, 14, 30);
        EventoDelegacao ed = new EventoDelegacao(dh, "Reunião de Projeto");
        EventoHeranca eh = new EventoHeranca(2025, 7, 5, 10, 0, "Apresentação Final");

        System.out.println("Usando Delegação:");
        System.out.println(ed);

        System.out.println("Usando Herança:");
        System.out.println(eh);
    }
}