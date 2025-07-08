package colecoes.questao96;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ConsultorioSimples {
    public static void main(String[] args) {
        // Filas
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random random = new Random();
        
        System.out.println("=== SIMULAÇÃO DO CONSULTÓRIO ===");
        
        // Gera e adiciona 20 pacientes nas filas
        for (int i = 1; i <= 20; i++) {
            String rg = i + ".000.000-0"; // RG simples
            int idade = 20 + random.nextInt(60); // 20-79 anos
            
            Paciente paciente = new Paciente(rg, idade);
            
            if (idade > 60) {
                filaPrioritaria.offer(paciente);
                System.out.println("Paciente " + i + " (idade " + idade + ") - FILA PRIORITÁRIA");
            } else {
                filaComum.offer(paciente);
                System.out.println("Paciente " + i + " (idade " + idade + ") - FILA COMUM");
            }
        }
        
        System.out.println("\n=== ATENDIMENTO ===");
        int atendidos = 0;
        
        // Atende pacientes: prioritária primeiro
        while (atendidos < 20 && (!filaPrioritaria.isEmpty() || !filaComum.isEmpty())) {
            Paciente paciente;
            
            if (!filaPrioritaria.isEmpty()) {
                paciente = filaPrioritaria.poll();
                System.out.println("Atendendo PRIORITÁRIO: " + paciente.getRg() + 
                                 " (idade " + paciente.getIdade() + ")");
            } else {
                paciente = filaComum.poll();
                System.out.println("Atendendo COMUM: " + paciente.getRg() + 
                                 " (idade " + paciente.getIdade() + ")");
            }
            
            atendidos++;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Pacientes atendidos: " + atendidos);
        System.out.println("Restam na fila prioritária: " + filaPrioritaria.size());
        System.out.println("Restam na fila comum: " + filaComum.size());
    }
}
