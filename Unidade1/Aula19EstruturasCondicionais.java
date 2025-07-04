public class Aula19EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;

        // Estrutura condicional simples (if)
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }

        // Estrutura condicional composta (if-else)
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Já pode votar");
        }

        // Estrutura condicional encadeada (if-else if-else)
        int nota = 7;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Estrutura condicional switch-case
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
        }
    }
}