package org.example;

public class login {
    public static void main (String[] args){
        String nomeUsuario = "Juliana";
        int senha = 01020304;

        boolean resultaNome = nomeUsuario.equals("Juliana");
        boolean resultaSenha = (senha == 01020304);

        //Exibindo resultados
        if (resultaNome && resultaSenha) {
            System.out.println(("Bem-vindo, usúario logado!" + resultaNome));
        }else {
            System.out.println(("Nome de usúario e senha inválidos" + resultaSenha));

        }

    }

}
