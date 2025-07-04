package Reuso.lista.questao62;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora{
    private LocalDateTime dataHora;


    DataHora(int ano, int mes, int dia, int hora, int minuto){
        this.dataHora = LocalDateTime.of(ano, mes, dia, hora, minuto);
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dataHora.format(fmt);
    }

}