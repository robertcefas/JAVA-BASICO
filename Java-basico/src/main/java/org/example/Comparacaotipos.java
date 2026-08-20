package org.example;

public class Comparacaotipos {
    public static void main(String[] args) {
        //Declaração de variáveis
        String nomeUsuario = "Marta";
        int senha =123;

        //Comparação de String e inteiros
        boolean resultaNome = nomeUsuario.equals("Marta");
        boolean resultaSenha = (senha == 456);

        //Exibindo resultados
        System.out.println(("O nome do usuário está correto?" + resultaNome));
        System.out.println(("A senha está coreta?" + resultaSenha));

    }
}
