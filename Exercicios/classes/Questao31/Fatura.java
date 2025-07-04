package Exercicios.classes.Questao31;

/*Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido:
 o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.*/

public class Fatura{
  private int identificacao;
  private String descricao;
  private int quantidadeCompra;
  private double valor;

  public String toString() {
    return "Fatura [identificacao=" + identificacao + ", descricao=" + descricao + ", quantidadeCompra="
        + quantidadeCompra + ", valor=" + valor + "]";
  }

  public Fatura(int id, String descricao, int nCompras, double valorCompra){
    this.identificacao = id;
    this.descricao = descricao;
    this.quantidadeCompra = (nCompras < 0) ? 0 : nCompras;
    this.valor = (valorCompra < 0) ? 0 : valorCompra;
  }

  public double calculaTotal(){
    return (quantidadeCompra * valor);
  }

  
}