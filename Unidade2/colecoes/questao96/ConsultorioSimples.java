package colecoes.questao96;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ConsultorioSimples {
    public static void main(String[] args) {
        // Configurações
        final int TOTAL_PACIENTES = 20;
        final int INTERVALO_CHEGADA = 4; // minutos
        final int TEMPO_CONSULTA = 5; // minutos
        
        // Filas
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random random = new Random();
        
        // Variáveis de controle
        int minuto = 0;
        int pacientesAtendidos = 0;
        int pacientesChegaram = 0;
        int fimConsulta = -1;
        Paciente atendendo = null;
        
        System.out.println("=== SIMULAÇÃO DO CONSULTÓRIO ===");
        System.out.println("Total de pacientes: " + TOTAL_PACIENTES);
        System.out.println("Chegada a cada " + INTERVALO_CHEGADA + " minutos");
        System.out.println("Consulta dura " + TEMPO_CONSULTA + " minutos\n");
        
        // Simulação minuto a minuto
        while (pacientesAtendidos < TOTAL_PACIENTES) {
            
            // Chegada de novo paciente (a cada 4 minutos)
            if (pacientesChegaram < TOTAL_PACIENTES && minuto % INTERVALO_CHEGADA == 0) {
                // Gera RG aleatório
                String rg = String.format("%d.%d.%d-%d", 
                    random.nextInt(100), random.nextInt(1000), 
                    random.nextInt(1000), random.nextInt(10));
                
                // Gera idade aleatória (18-85 anos)
                int idade = 18 + random.nextInt(68);
                
                Paciente novoPaciente = new Paciente(rg, idade);
                pacientesChegaram++;
                
                // Coloca na fila apropriada
                if (novoPaciente.getIdade() > 60) {
                    filaPrioritaria.offer(novoPaciente);
                    System.out.println("Minuto " + minuto + ": Paciente " + rg + 
                        " (idade " + idade + ") → FILA PRIORITÁRIA");
                } else {
                    filaComum.offer(novoPaciente);
                    System.out.println("Minuto " + minuto + ": Paciente " + rg + 
                        " (idade " + idade + ") → FILA COMUM");
                }
            }
            
            // Termina consulta atual
            if (minuto == fimConsulta && atendendo != null) {
                System.out.println("Minuto " + minuto + ": Consulta finalizada - " + 
                    atendendo.getRg());
                pacientesAtendidos++;
                atendendo = null;
            }
            
            // Inicia nova consulta
            if (atendendo == null) {
                // Prioridade: fila prioritária primeiro
                if (!filaPrioritaria.isEmpty()) {
                    atendendo = filaPrioritaria.poll();
                } else if (!filaComum.isEmpty()) {
                    atendendo = filaComum.poll();
                }
                
                if (atendendo != null) {
                    fimConsulta = minuto + TEMPO_CONSULTA;
                    System.out.println("Minuto " + minuto + ": Iniciando consulta - " + 
                        atendendo.getRg() + " (idade " + atendendo.getIdade() + ")");
                }
            }
            
            minuto++;
        }
        
        System.out.println("\n=== SIMULAÇÃO CONCLUÍDA ===");
        System.out.println("Tempo total: " + minuto + " minutos");
        System.out.println("Pacientes atendidos: " + pacientesAtendidos);
        System.out.println("Pacientes na fila prioritária: " + filaPrioritaria.size());
        System.out.println("Pacientes na fila comum: " + filaComum.size());
    }
}
