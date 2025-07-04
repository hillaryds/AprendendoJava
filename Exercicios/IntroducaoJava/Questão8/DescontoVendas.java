package Exercicios.IntroducaoJava.Questão8;
/*Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/

import java.util.Scanner;
public class DescontoVendas{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int codigoSetor;
        double valorProdutoOriginal;

        do{
            System.out.print("Digite o código do setor do produto: ");
            codigoSetor = scanner.nextInt(); 

        }while(validaCodigo(codigoSetor) == false);
        

        System.out.print("Digite o preco do seu produto: ");
        valorProdutoOriginal = scanner.nextDouble();

        if (codigoSetor == 222 && valorProdutoOriginal > 500){
            valorProdutoOriginal -= (valorProdutoOriginal * 0.1);
        }else if (codigoSetor == 111){
            if (valorProdutoOriginal > 100){
                valorProdutoOriginal -= (valorProdutoOriginal * 0.4);
            }else if(valorProdutoOriginal >= 50){
                valorProdutoOriginal -= (valorProdutoOriginal * 0.2);
            }else{
                valorProdutoOriginal -= (valorProdutoOriginal * 0.1);
            }
        }

        System.out.printf("O valor do seu produto eh de:  R$%.2f%n", valorProdutoOriginal);

        scanner.close();
    }

    public static boolean validaCodigo(int codigo){
        if(codigo == 222 || codigo == 111){
            return true;
        }
        else{
            System.out.println("Setor invalido!!");
            return false;
        }
    }
}