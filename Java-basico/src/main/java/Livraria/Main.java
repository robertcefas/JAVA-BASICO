package Livraria;

public class Main {
    static void main() {
        Livro livros1 = new Livro("O Pequeno Principe", "Antoine de Saint-Exupéry", 89,36.99);
        Livro livros2 = new Livro("O Homem Mais rico da Babilonia", "George S. Clason", 78,36.99);

        System.out.println("\nLIVROS\n ");
        System.out.println("Título: " + livros1.getTitulo());
        System.out.println("Autor: " + livros1.getAutor());
        System.out.println("Número de Paginas: " + livros1.getPagina());
        System.out.println("Preço: " + livros1.getPreco());
        System.out.println("====================================================");

        System.out.println("Título: " + livros2.getTitulo());
        System.out.println("Autor: " + livros2.getAutor());
        System.out.println("Número de Paginas: " + livros2.getPagina());
        System.out.println("Preço: " + livros2.getPreco());
    }

}
