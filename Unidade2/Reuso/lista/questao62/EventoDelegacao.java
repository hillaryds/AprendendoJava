package Reuso.lista.questao62;

public class EventoDelegacao {
    private DataHora dataHora;
    private String evento;

    public EventoDelegacao(DataHora dataHora, String evento) {
        this.dataHora = dataHora;
        this.evento = evento;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public String getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return "Evento: " + evento + " | Data e Hora: " + dataHora;
    }
}