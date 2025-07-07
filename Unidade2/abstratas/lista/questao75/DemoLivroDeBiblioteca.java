package abstratas.lista.questao75;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        // Criando um objeto LivroDeBiblioteca
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
            "Dom Casmurro", 
            "Machado de Assis", 
            256, 
            1899, 
            "corredor 3, prateleira A"
        );
        
        System.out.println("=== DEMONSTRAÇÃO DO LIVRO DE BIBLIOTECA ===\n");
        
        // Demonstrando os métodos da classe Livro
        System.out.println("Título: " + livro.qualTitulo());
        System.out.println("Autor: " + livro.qualAutor());
        System.out.println("Localização: " + livro.localizacao());
        System.out.println("Descrição: " + livro.descricao());
        
        // Demonstrando os métodos da interface ItemDeBiblioteca
        System.out.println("\n--- Status inicial ---");
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        System.out.println("Máximo de dias para empréstimo: " + ItemDeBiblioteca.maximoDeDiasParaEmprestimo);
        
        System.out.println("\n--- Emprestando o livro ---");
        livro.empresta();
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        
        System.out.println("\n--- Devolvendo o livro ---");
        livro.devolve();
        System.out.println("Está emprestado? " + livro.estaEmprestado());
        
        System.out.println("\n--- Informações completas do livro ---");
        System.out.println(livro.toString());
        
        System.out.println("\n=== CRIANDO OUTRO LIVRO ===\n");
        
        // Criando outro exemplo
        LivroDeBiblioteca livro2 = new LivroDeBiblioteca(
            "O Cortiço", 
            "Aluísio Azevedo", 
            304, 
            1890, 
            "corredor 2, prateleira D"
        );
        
        System.out.println("Segundo livro criado:");
        System.out.println("Descrição: " + livro2.descricao());
        System.out.println("Localização: " + livro2.localizacao());
        
        // Testando empréstimo do segundo livro
        System.out.println("\nEmprestando o segundo livro...");
        livro2.empresta();
        System.out.println("Status: " + (livro2.estaEmprestado() ? "Emprestado" : "Disponível"));
        
        System.out.println("\nInformações completas do segundo livro:");
        System.out.println(livro2.toString());
    }
}
