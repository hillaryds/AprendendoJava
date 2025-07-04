/*38. Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */
package Exercicios.classes.Questão38;

import Exercicios.classes.Questão37.Contador;

public class Lampada {
    private boolean estadoDaLampada; // true = ligada, false = desligada
    private Contador contadorAcesa;
    public Lampada() {
        estadoDaLampada = false;
        contadorAcesa = new Contador();
    }
    // Liga a lâmpada
    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            contadorAcesa.incrementar();
        }
    }
    // Desliga a lâmpada
    public void apaga() {
        estadoDaLampada = false;
    }
    // Mostra o estado atual da lâmpada
    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }
    // Retorna true se a lâmpada estiver ligada
    public boolean estaLigada() {
        return estadoDaLampada;
    }
    // Mostra quantas vezes a lâmpada foi acesa
    public void mostrarQuantidadeAcesa() {
        System.out.print("A lâmpada foi acesa ");
        contadorAcesa.imprimir();
    }
}
