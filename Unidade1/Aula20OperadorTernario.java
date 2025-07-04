public class Aula20OperadorTernario {

    /*
    O operador ternário é uma forma resumida de escrever uma estrutura condicional if-else em Java. 
    Ele avalia uma condição e retorna um valor se ela for verdadeira e outro valor se for falsa.
    Sintaxe:
    resultado = condicao ? valorSeVerdadeiro : valorSeFalso;
     */
    public static void main(String[] args) {
        int idade = 17;

        // Exemplo 1: Verificar maioridade
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status); // Menor de idade

        // Exemplo 2: Situação do aluno
        int nota = 6;
        String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado); // Reprovado

        // Exemplo 3: Par ou ímpar
        int numero = 9;
        String parOuImpar = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(parOuImpar); // Ímpar

        // Exemplo 4: Valor absoluto
        int valor = -10;
        int absoluto = (valor < 0) ? -valor : valor;
        System.out.println("Valor absoluto: " + absoluto); // 10

        // Exemplo 5: Mensagem personalizada
        boolean usuarioLogado = false;
        String mensagem = usuarioLogado ? "Bem-vindo de volta!" : "Faça login para continuar.";
        System.out.println(mensagem); // Faça login para continuar.
    }
}