package Unidade2.Arrayslist.contabanco;

import java.util.Scanner;

public class MenuConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu Conta Bancária ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Visualizar Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: R$ ");
                    double valorDep = scanner.nextDouble();
                    conta.depositar(valorDep);
                    System.out.print("Pressione ENTER para continuar...");
                    scanner.nextLine(); // consome o \n pendente
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Valor para saque: R$ ");
                    double valorSaq = scanner.nextDouble();
                    conta.sacar(valorSaq);
                    System.out.print("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    conta.visualizarExtrato();
                    System.out.print("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.print("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }
}