package Arrayslist.Lista.questao1;
/* 
 Crie também uma classe Agenda que:
 • encapsule uma agenda de compromissos representada por um ArrayList de instâncias da classe EntradaEmAgenda;– este item é obrigatório. Caso não seja contemplado, toda a questão será des
considerada
 • implemente um método construtor;
 • possua um método para adicionar um novo compromisso à lista de compromissos;
 • tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
 instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
 Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 2 compro
missos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
 data do seu aniversário */

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> historico;

    public Agenda() {
        this.historico = new ArrayList<>();
    }

    public void novoCompromisso(String h, int d, int m, int a, String ass){
        EntradaEmAgenda novoC = new EntradaEmAgenda(h, d, m, a, ass);
        historico.add(novoC);
    }


    public void listaDia(int d, int m, int a) {
        System.out.println("=== Compromissos do dia " + d + "/" + m + "/" + a + " ===");
        boolean encontrou = false;
        
        for (EntradaEmAgenda entrada : historico) {
            if (entrada.ehNoDia(d, m, a)){
                System.out.println(entrada);
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum compromisso encontrado para esta data.");
        }
        
        System.out.println("==========================================");
    }
}
