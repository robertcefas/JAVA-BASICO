package org.example;

public class Metodosstring {
    public static void main(String[] args) {

        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo q quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat("").concat(sobrenome);

        //Exibindo nome copmpleto usando métodos String - Maiúsculas
        System.out.println("Concatenaç~]ao Maiúscula: " + nomeCompleto.toUpperCase());

        //Exibindo nome copmpleto usando métodos String - Minúsculo
        System.out.println("Concatenaç~]ao Maiúscula: " + nomeCompleto.toLowerCase());


    }
}
