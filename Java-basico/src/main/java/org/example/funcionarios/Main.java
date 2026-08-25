package org.example.funcionarios;

public class Main {
    static void main() {
        //Instanciar classes: Livro e Funcionario.
        Livro livro1 = new Livro("Harry Potter","Machado de Assis", 210,130);
        Funcionario funcionario1 = new Funcionario("Robert", "001.002.003.04", "16/05/2005", "robert@email.com");

        System.out.println("=DADOS DO LIVRO=");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroDePaginas());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("\n=DADOS DO FUNCIONÁRIO=");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("CPF: " + funcionario1.getCpf());
        System.out.println("Data de nascimento: " + funcionario1.getDataDeNascimento());
        System.out.println("E-mail: " + funcionario1.getEmail());
    }
}
