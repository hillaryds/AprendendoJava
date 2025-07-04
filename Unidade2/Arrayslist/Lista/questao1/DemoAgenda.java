package Arrayslist.Lista.questao1;

public class DemoAgenda {
    public static void main(String[]args){
        Agenda agendaEu = new Agenda();
        
        agendaEu.novoCompromisso(18, 06, 2025, 14, "Me matar");
        agendaEu.novoCompromisso(18, 06, 2025, 15, "Reuniao");
        agendaEu.novoCompromisso(18, 06, 2025, 12, "AAAAAAAAAAAAAAAAAAAa");
        agendaEu.listaDia(18, 06, 2025);
    }
}
