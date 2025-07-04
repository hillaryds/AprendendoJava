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

    public void novoCompromisso(int d, int m, int a, int h, String ass){
        if( h >= 0 && h < 24 && m < 13 && m > 0 && a >= 2025){
            EntradaEmAgenda novoC = new EntradaEmAgenda(h, d, m, a, ass);
            historico.add(novoC);
        }
        else{
            System.out.println("Seu compromisso nao pode ser adicionado. Tente novamente");
        }
    }


    public void listaDia(int d, int m, int a) {
        System.out.println("=== Historico do dia ===");
        for (EntradaEmAgenda assunto : historico) {
            if (assunto.ehNoDia( d, m, a)){
                System.out.println(assunto);
            }
        }
        System.out.println("=======================");
    }



    

    
}
