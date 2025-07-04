package Reuso.lista.questao62;

public class EventoHeranca  extends DataHora {
    private String evento;

    public EventoHeranca(int ano, int mes, int dia, int hora, int minuto, String evento) {
        super(ano, mes, dia, hora, minuto);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public String toString() {
        return "Evento: " + evento + " | Data e Hora: " + super.toString();
    }
}