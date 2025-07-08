package Arrayslist.Lista.questao1;

public class DemoAgenda {
    public static void main(String[]args){
        Agenda agendaEu = new Agenda();
        
        agendaEu.novoCompromisso("18:00", 06, 12, 2025, "Me matar");
        agendaEu.novoCompromisso("19:55", 06, 2025, 15, "Reuniao");
        agendaEu.listaDia(06, 12, 2025);
    }
}
