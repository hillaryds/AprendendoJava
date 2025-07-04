package Exercicios.classes.Questão36;
/*36. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
execute todos os métodos da classe.
*/

public class Elevador{
    private int andarAtual;
    private final int andaresPredio;
    private final int capacidade;
    private int lotacao;

    Elevador(int capacidade, int andares){
        this.andarAtual = 0;
        this.andaresPredio = andares;
        this.capacidade = capacidade;
        this.lotacao = 0;
    }

    public void entra(){
        if(this.lotacao < this.capacidade){
            this.lotacao ++;
            System.out.println("Uma pessoa entrou no elevador");
        }else{
            System.out.println("Nao ha espaco no elevador");
        }
    }

    public void sai(){
        if(this.lotacao > 0){
            this.lotacao--;
            System.out.println("Uma pessoa saiu do elevador");
        }else{
            System.out.println("Nao ha mais pessoas no elevador");
        }
    }

    public void sobe(){
        if(this.andarAtual >= this.andaresPredio){
            System.out.println("Já estamos no último andar");
        }else{
            this.andarAtual++;
            System.out.println("Subindo um andar");
        }
    }

    public void desce(){
        if(this.andarAtual <=0){
            System.out.println("Ja estamos no terreo");
        }else{
            this.andarAtual --;
            System.out.println("Descendo uma andar");
        }
    }
}