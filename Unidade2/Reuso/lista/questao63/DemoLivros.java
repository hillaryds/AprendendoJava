package Reuso.lista.questao63;

public class DemoLivros {
    public static void main(String[] args) {
        LivroLivraria livraria = new LivroLivraria("Java Básico", "Italo Assis", 2022, 59.90, 10);
        LivroBiblioteca biblioteca = new LivroBiblioteca("Estruturas de Dados", "Carlos Souza", 2018, "QA76.9", true);

        System.out.println("Livro de Livraria:");
        System.out.println(livraria);

        System.out.println("Livro de Biblioteca:");
        System.out.println(biblioteca);
    }
}