package Arrayslist.Lista.questao1;
/* Crie uma classe EntradaEmAgenda que contenha:
 • os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano
 e assunto);
 • um construtor;
 • um método toString;
 • um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia,
 mês e ano daquela instância da classe forem iguais aos argumentos passados.
 Crie também uma classe Agenda que:
 • encapsule uma agenda de compromissos representada por um ArrayList de instân
cias da classe EntradaEmAgenda;– este item é obrigatório. Caso não seja contemplado, toda a questão será des
considerada
 • implemente um método construtor;
 • possua um método para adicionar um novo compromisso à lista de compromissos;
 • tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
 instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
 Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 2 compro
missos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
 data do seu aniversário */


public class EntradaEmAgenda{
    private String hora; // Mudança: hora como String para permitir formato "HH:MM"
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(String h, int d, int m, int a, String ass){
        this.hora = h;
        this.dia = d;
        this.mes = m;
        this.ano = a;
        this.assunto = ass;
    }

    public String toString(){
        return "Às " + hora + " do dia " + dia + "/" + mes + "/" + ano + " - Compromisso: " + assunto;
    }

    public boolean ehNoDia(int d, int m, int a){
        if( d == this.dia && m == this.mes && a == this.ano){
            return true;
        }
        else{ return false;
        }

    }



}