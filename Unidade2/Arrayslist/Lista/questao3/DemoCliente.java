package Arrayslist.Lista.questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("Digite o ID do cliente (negativo quando não quiser mais adicionar): ");
            int id = sc.nextInt();
            if (id < 0){
                break;
            }

            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();

            clientes.add(new Cliente( id, nome, idade, telefone));

        }

        System.out.println("\nClientes cadastrados: ");
        for (Cliente c : clientes){
            System.out.println(c);
        }

        sc.close();
    }
}
