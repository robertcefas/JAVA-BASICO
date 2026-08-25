package org.example.veiculo;

import org.example.livros.Livro;

public class Main {
    static void main() {
        Veiculos veiculos1 = new Veiculos("NZL-856", "branco", 5, 43, "200km", "8Km/l");
        Veiculos veiculos2 = new Veiculos("JPk-869", "vermelho", 2, 14, "180km", "8Km/l");
        Livro livro1 = new Livro("Harry Potter", "Machado de Assis", 230, 190);
        Livro livro2 = new Livro("O Pequeno Pincipe", "Ziraldo", 98, 36);

        System.out.println("Veiculo1");
        System.out.println(veiculos1);
        System.out.println("Veiculo2");
        System.out.println(veiculos2);
        System.out.println("Livros1");
        System.out.println(livro1);
        System.out.println("Livro2");
        System.out.println(livro2);


    }
}
