public class Aula17OperadoresLogicos {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        // Operador E lógico (&&) - verdadeiro se ambos forem verdadeiros
        boolean resultadoE = verdadeiro && falso;
        System.out.println("true && false: " + resultadoE); // false

        // Operador OU lógico (||) - verdadeiro se pelo menos um for verdadeiro
        boolean resultadoOu = verdadeiro || falso;
        System.out.println("true || false: " + resultadoOu); // true

        // Operador NÃO lógico (!) - inverte o valor booleano
        boolean resultadoNao = !verdadeiro;
        System.out.println("!true: " + resultadoNao); // false

        // Exemplo prático combinando operadores
        int idade = 18;
        boolean temCarteira = true;

        // Verifica se a pessoa pode dirigir (idade >= 18 E tem carteira)
        boolean podeDirigir = (idade >= 18) && temCarteira;
        System.out.println("Pode dirigir? " + podeDirigir); // true

        // Exemplo 1: Pode votar?
        int idadee = 16;
        boolean tituloEleitor = false;
        boolean podeVotar = (idadee >= 16) && tituloEleitor;
        System.out.println("Pode votar? " + podeVotar); // false

        // Exemplo 2: Acesso permitido?
        boolean usuarioAtivo = true;
        boolean senhaCorreta = false;
        boolean acessoPermitido = usuarioAtivo && senhaCorreta;
        System.out.println("Acesso permitido? " + acessoPermitido); // false

        // Exemplo 3: Promoção válida?
        boolean temCupom = true;
        boolean compraMinima = false;
        boolean promocaoValida = temCupom || compraMinima;
        System.out.println("Promoção válida? " + promocaoValida); // true

        // Exemplo 4: Negando uma condição
        boolean bloqueado = false;
        boolean podeAcessar = !bloqueado;
        System.out.println("Pode acessar? " + podeAcessar); // true

        // Exemplo 5: Faixa etária para desconto (idade entre 12 e 18)
        int idadeAluno = 15;
        boolean temDesconto = (idadeAluno >= 12) && (idadeAluno <= 18);
        System.out.println("Tem desconto? " + temDesconto); // true
    }
}