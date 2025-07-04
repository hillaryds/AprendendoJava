package Unidade2.Arrayslist.contabanco;

import java.util.ArrayList;

public class Conta {
    private double saldo;
    private ArrayList<String> extrato;

    public Conta() {
        saldo = 0.0;
        extrato = new ArrayList<>();
        extrato.add("Conta criada. Saldo inicial: R$ 0.00");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: +R$ " + String.format("%.2f", valor) + " | Saldo: R$ " + String.format("%.2f", saldo));
        } else {
            extrato.add("Tentativa de depósito inválido: R$ " + String.format("%.2f", valor));
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add("Saque: -R$ " + String.format("%.2f", valor) + " | Saldo: R$ " + String.format("%.2f", saldo));
        } else {
            extrato.add("Tentativa de saque inválido: R$ " + String.format("%.2f", valor));
        }
    }

    public void visualizarExtrato() {
        System.out.println("=== Extrato da Conta ===");
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
        System.out.println("Saldo final: R$ " + String.format("%.2f", saldo));
        System.out.println("=======================");
    }
}