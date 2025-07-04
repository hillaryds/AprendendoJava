public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos numéricos inteiros
        int idade = 25; // inteiro comum
        long numeroGrande = 10000000000L; // long precisa do 'L' no final
        byte idadeByte = 127; // valor máximo do byte
        short idadeShort = 32000; // short aceita valores maiores que byte

        // Tipos primitivos numéricos de ponto flutuante
        double salarioDouble = 2500.75; // double aceita casas decimais
        float salarioFloat = 1800.50F; // float precisa do 'F' no final

        // Tipos primitivos lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        // Tipo primitivo caractere
        char caractere = 'A'; // aspas simples para char

        // Exemplo de casting (conversão de tipos)
        int idadeConvertida = (int) 30.7; // converte double para int (perde a parte decimal)
        float salarioConvertido = (float) 1999.99; // converte double para float

        // String (não é tipo primitivo, é uma classe)
        String nome = "Seu Nome Aqui";

        // Impressão dos valores
        System.out.println("int idade: " + idade);
        System.out.println("long numeroGrande: " + numeroGrande);
        System.out.println("byte idadeByte: " + idadeByte);
        System.out.println("short idadeShort: " + idadeShort);
        System.out.println("double salarioDouble: " + salarioDouble);
        System.out.println("float salarioFloat: " + salarioFloat);
        System.out.println("boolean verdadeiro: " + verdadeiro);
        System.out.println("boolean falso: " + falso);
        System.out.println("char caractere: " + caractere);
        System.out.println("int idadeConvertida (casting): " + idadeConvertida);
        System.out.println("float salarioConvertido (casting): " + salarioConvertido);
        System.out.println("String nome: " + nome);
    }
}